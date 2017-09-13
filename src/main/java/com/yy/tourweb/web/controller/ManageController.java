package com.yy.tourweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yy.tourweb.web.dto.TPicDto;
import com.yy.tourweb.web.service.IAdditionService;
import com.yy.tourweb.web.service.ILineService;
import com.yy.tourweb.web.service.IPicService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 聚合码页面跳转Controller
 * @author yy 2017-2-24
 *
 */
@Controller
public class ManageController {
//	private static AppLogger logger = new AppLogger(H5ManageController.class);
	
	@Resource
	private ILineService lineService;
	
	@Resource
	private IPicService picService;
	
	@Resource
	private IAdditionService additionService;
	
    /**
     * 首页展示
     * @param request
     * @param model
     */
    @RequestMapping("/")
    public String showMain(HttpServletRequest request, Model model) {
    	//查询redis中首页大图url
    	
    	//查询首页权重前12的线路list(包含：首页图url→上传图时对首页图进行等比压缩？line_no、名称、类型、价格、天数)
    	
    	List<TPicDto> llist = picService.queryMainPicList();//先走redis查询，没有再查数据库
    	List<Map<String,Object>> plist = lineService.queryLineList(0);//先走redis查询，没有再查数据库
    	
		model.addAttribute("lineList", llist);
    	model.addAttribute("picList", plist);
		return "index";	
    }
    
    /**
     * 产品列表页
     * @param request
     * @param model
     */
    @RequestMapping("/list")
    public String showList(HttpServletRequest request, Model model) {
    	List<Map<String,Object>> llist = lineService.queryLineList(1);//先走redis查询，没有再查数据库
		model.addAttribute("lineList", llist);
		return "list";	
    }
    
    @RequestMapping("/list/{lineNo}")
    public String queryOneLine(@PathVariable String lineNo,Model model){
    	//线路信息与图片 价格信息
    	//优化方案：异步请求相似线路
    	try {
			List<Map<String,Object>> oneLine = lineService.queryOneLine(lineNo);//先走redis查询，没有再查数据库
			model.addAttribute("line", oneLine);
		} catch (Exception e) {
			System.out.println("您访问的页面不存在！");
			return "error";
		}
    	
    	List<Map<String,Object>> addList   = additionService.queryLineAddition(lineNo, 0);
    	List<Map<String,Object>> unaddlist = additionService.queryLineAddition(lineNo, 1);
    	
    	List<Map<String,Object>> llist = lineService.queryRandom3();
    	model.addAttribute("llist", llist);
    	model.addAttribute("addList", addList);
    	model.addAttribute("unaddlist", unaddlist);
    	
    	return "tour";
    }
    
/*    *//**
     * 提交订单 并从支付系统获取微信或支付宝授权 返回给前端
     * @param posOrderDto
     *//*
    @RequestMapping("/forwardAccredit")
//    @Token(needRemoveToken=true)
    public @ResponseBody Object getAccredit(PosOrderDto posOrderDto) {
    	logger.info("forwardAccredit::"+"orderAmt:"+posOrderDto.getOrderAmt()+"|orderPayType:"+posOrderDto.getPayType());
    	JSONObject json = new JSONObject();
		String bizCode = "";
		HashMap<String,Object> errMap = new HashMap<String, Object>();
		if(posOrderDto.getPayType() == null){
			logger.error("用户请求参数异常");
			json.put("errInfo", "H1002");
			errMap.put("errCode", PosERRCode.ERROR_CODE_PARAM.getCode());
			errMap.put("errMsg", PosERRCode.ERROR_CODE_PARAM.getDesc());
			json.put("errInfo", errMap);
			return json;
		}else if(3 == posOrderDto.getPayType()){//wechat
    		bizCode = "WCPAY";
    	}else if(2 == posOrderDto.getPayType()){//alipay
    		bizCode = "ALPAY";
    	}else{
    		logger.error("用户在非支付宝或微信终端打开");
    		errMap.put("errCode", PosERRCode.ERROR_CODE_CLIENT.getCode());
            errMap.put("errMsg", PosERRCode.ERROR_CODE_CLIENT.getDesc());
			json.put("errInfo", errMap);
    		return json;
    	}
    	
        // 订单金额不能为0
        if (StringUtils.isBlank(String.valueOf(posOrderDto.getOrderAmt())) || 
        		!Pattern.compile("^[1-9][0-9]*$").matcher(String.valueOf(posOrderDto.getOrderAmt())).find()) {
            logger.info("订单金额为0");
            errMap.put("errCode", PosERRCode.ERROR_CODE_NO_MONEY.getCode());
            errMap.put("errMsg", PosERRCode.ERROR_CODE_NO_MONEY.getDesc());
			json.put("errInfo", errMap);
            return json;
        }

        PosMerchantDto pmd = merchantService.queryByMerchantCodeRedis(posOrderDto.getMerchantCode());
        String merchantName = pmd.getMerchantName(); 
        String signPlistName = merchantName;
        String terminalDate = String.valueOf(System.currentTimeMillis());

        String payTradeNo = "";
        String httpForm = "";
        PosMerchantServiceDto msd = posMerchantBizService.queryOpenedBizByPayTypeRedis(pmd.getMerchantCode(), bizCode);
        if (msd == null) {
            if(3 == posOrderDto.getPayType()){//wechat
            	logger.info("该商户未开通微信服务，请尝试使用支付宝付款！");
            	json.put("errInfo", "H1005");
            	errMap.put("errCode", PosERRCode.ERROR_CODE_NO_WECHAT.getCode());
                errMap.put("errMsg", PosERRCode.ERROR_CODE_NO_WECHAT.getDesc());
    			json.put("errInfo", errMap);
            	return json;
        	}else if(2 == posOrderDto.getPayType()){//alipay
        		logger.info("该商户未开通支付宝服务，请尝试使用微信付款！");
        		json.put("errInfo", "H1006");
        		errMap.put("errCode", PosERRCode.ERROR_CODE_NO_ALIPAY.getCode());
                errMap.put("errMsg", PosERRCode.ERROR_CODE_NO_ALIPAY.getDesc());
    			json.put("errInfo", errMap);
        		return json;
        	}else{
        		logger.error("用户请求参数异常");
    			json.put("errInfo", "H1002");
    			errMap.put("errCode", PosERRCode.ERROR_CODE_PARAM.getCode());
    			errMap.put("errMsg", PosERRCode.ERROR_CODE_PARAM.getDesc());
    			json.put("errInfo", errMap);
    			return json;
        	}
        }
        
        String payMerchantCode = 
        		posRouteServiceFacade.queryRouteMerchant(posOrderDto.getMerchantCode(), posOrderDto.getPayType(), PayWayEnum.PYA_TYPE_H5.getCode());
        String orderNo = seqService.getNewOrderNo();

        // 2: 支付宝       3: 微信
        Integer clearType = msd.getClearType();
        // 支付公司分配的收单渠道标识 一清商户默认为微信和支付宝真实账号，二清商户未空
        String channelId = payMerchantCode;
        PosMerchantAppkeyDto appKeyDto = null;
        if (SquarePayTypeEnum.PAY_TYPE_WECHAT.getCode().equals(String.valueOf(posOrderDto.getPayType())) && 
        		Integer.valueOf(ClearTypeEnum.CLEAR_TYPE_2.getCode()).equals(clearType)) {
            logger.info("##微信二清查询商户支付秘钥");
            appKeyDto = posMerchantBizService.queryAppKeyByCodeRedis(payMerchantCode);
            //微信二清支付
            channelId = null;
        }
        try {
        	Map<String, Object> squareMap = PayUtil.mobilePay(signPlistName, "", channelId, orderNo, posOrderDto.getOrderAmt(), String.valueOf(posOrderDto.getPayType()), appKeyDto);
			if (squareMap != null && "00000000".equals(squareMap.get("responseCode"))) {
				payTradeNo = squareMap.get("tradeNo") + "";
				httpForm = ((JSONObject) squareMap.get("submitForm")) + "";
			} else {
				logger.info("支付系统返回订单状态不成功！");
				errMap.put("errCode", PosERRCode.ERROR_CODE_PAY_SYS_ERR.getCode());
				errMap.put("errMsg", PosERRCode.ERROR_CODE_PAY_SYS_ERR.getDesc());
				json.put("errInfo", errMap);
				return json;
			}
		} catch (Exception e) {
			logger.error(e);
			errMap.put("errCode", PosERRCode.ERROR_CODE_SYS.getCode());
			errMap.put("errMsg", PosERRCode.ERROR_CODE_SYS.getDesc());
			json.put("errInfo", errMap);
    		return json;
		}
    
        posOrderDto.setReferNo(payTradeNo);
        posOrderDto.setPayWay(3);//新增3
    
        posOrderDto.setOrderNo(orderNo);
        posOrderDto.setTradeStatus(Integer.parseInt(TradestatusEnum.TRADESTATUS_CREATE.getCode()));
        posOrderDto.setMerchantName(merchantName);
        posOrderDto.setMachineSn(posOrderDto.getMachineSn());
        posOrderDto.setOrderAmt(posOrderDto.getOrderAmt());
        posOrderDto.setTradeAmt(posOrderDto.getOrderAmt());
        //交易类型 默认 1消费
        posOrderDto.setTradeType(1);
        posOrderDto.setTerminalDate(terminalDate);
        posOrderDto.setOrderType(1);
        Calendar c = Calendar.getInstance();
        posOrderDto.setCreateDate(c.getTime());
        posOrderDto.setUpdateDate(c.getTime());
        posOrderDto.setChan_id(1);//新增
        
        posOrderDto.setHqMerchantCode(pmd.getHqMerchantCode());
        posOrderDto.setMerchantPayCode(payMerchantCode);
        baseService.insert(posOrderDto);

        json.put("errInfo", PosERRCode.SUCCESS.getCode());
        json.put("httpForm", httpForm);
        logger.info("Json:"+json);
        return json;
    }
    
    *//**
     * 订单完成后 由微信成功页面跳转到自定义成功页面
     * @param orderNo
     *//*
    @RequestMapping("/success/{orderNo}")
    public String redirectSuc(@PathVariable String orderNo,Model model) {
    	PosOrderDto pod = new PosOrderDto();
    	pod.setOrderNo(orderNo);
    	pod = (PosOrderDto) baseService.query(pod);
    	
    	BigDecimal orderAmtCut = new BigDecimal(pod.getOrderAmt()).movePointLeft(2);
    	model.addAttribute("orderAmt",orderAmtCut);
    	if(!TradestatusEnum.TRADESTATUS_SUCCESS.getCode().equals(String.valueOf(pod.getTradeStatus()))){
    		model.addAttribute("merchantCode", pod.getMerchantCode());
    		model.addAttribute("machineSn", pod.getMachineSn());
    		logger.info("redirect to index.jsp");
    		return "index";	
    	}else{
    		String end6orderNo = orderNo.substring(orderNo.length()-6);
    		model.addAttribute("orderNo",end6orderNo);
    		model.addAttribute("merchantName",pod.getMerchantName());
    		logger.info("redirect to success.jsp");
    		return "success";
    	}
    }
    
    *//**
     * 验证订单状态
     * @param pod
     *//*
    @RequestMapping("/checkStatus")
    @ResponseBody
    public Object checkStatus(PosOrderDto pod) {
    	logger.info("checkStatus::orderNo:"+pod.getOrderNo());
    	JSONObject json = new JSONObject();
    	String orderNo = pod.getOrderNo();
    	pod = (PosOrderDto) baseService.query(pod);
    	
    	json.put("orderNo",orderNo);
    	int tradeStatus = pod.getTradeStatus();
    	json.put("tradeStatus",tradeStatus);
    	//终态直接返回
    	if(Integer.valueOf(TradestatusEnum.TRADESTATUS_SUCCESS.getCode()) == tradeStatus
    			||Integer.valueOf(TradestatusEnum.TRADESTATUS_FAIL.getCode()) == tradeStatus){
    		logger.info("Json:"+json);
    		return json;
    	}
    	
        String payType = pod.getPayType().toString();
        PosMerchantAppkeyDto appKeyDto=null;
        if (SquarePayTypeEnum.PAY_TYPE_WECHAT.getCode().equals(payType)) {
        	PosMerchantDto pmd = merchantService.queryByMerchantCodeRedis(pod.getMerchantCode());
            PosMerchantServiceDto merchantServiceDto = posMerchantBizService.queryOpenedBizByPayTypeRedis(pmd.getMerchantCode(), payType);
            if (merchantServiceDto != null && Integer.valueOf(ClearTypeEnum.CLEAR_TYPE_2.getCode()).equals(merchantServiceDto.getClearType())) {
                String merchantPayCode = 
                		posRouteServiceFacade.queryRouteMerchant(pod.getMerchantCode(), pod.getPayType(), PayWayEnum.PYA_TYPE_H5.getCode());
                appKeyDto = posMerchantBizService.queryAppKeyByCodeRedis(merchantPayCode);
            }
        }
        
        Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap = PayUtil.queryMobilPayStatus(orderNo, appKeyDto);
		} catch (Exception e) {
			logger.error(e);
			return json;
		}
		int updateNum = 0;
        if (resultMap != null) {
            *//**
             * 支付返回交易状态 S:成功 F:失败 I:处理中
             * *//*
            Object payResTradeStatus = resultMap.get("tradeStatus");
            if (null!=payResTradeStatus) {
            	String payResTradeStatusStr = payResTradeStatus.toString();
            	if ("S".equals(payResTradeStatusStr)) {
                    tradeStatus = Integer.valueOf(TradestatusEnum.TRADESTATUS_SUCCESS.getCode());
                }
                if ("F".equals(payResTradeStatusStr)) {
                    tradeStatus = Integer.valueOf(TradestatusEnum.TRADESTATUS_FAIL.getCode());
                }
                if ("I".equals(payResTradeStatusStr)) {
                    tradeStatus = Integer.valueOf(TradestatusEnum.TRADESTATUS_DEALING.getCode());
                }
			}
            
            Map<String, Object> updateMap=new HashMap<String, Object>();
            updateMap.put("tradeResCode", resultMap.get("responseCode").toString());
            updateMap.put("tradeResRemark", resultMap.get("responseDesc").toString());
            if(resultMap.get("tradeAmount") != null){
                updateMap.put("tradeAmt", Long.valueOf(resultMap.get("tradeAmount").toString()));
            }
            updateMap.put("referNo", resultMap.get("tradeNo").toString());
            updateMap.put("tradeStatus", tradeStatus);
            updateMap.put("oldTradeStatus", pod.getTradeStatus());
            if (null != resultMap.get("tradeTime")) {
                updateMap.put("tradeDate", new Date(Long.parseLong(resultMap.get("tradeTime").toString())));
            }else {
                updateMap.put("tradeDate", new Date());
            }
            //成功或失败更新到数据库中
            if (Integer.valueOf(TradestatusEnum.TRADESTATUS_SUCCESS.getCode()) == tradeStatus
                    ||Integer.valueOf(TradestatusEnum.TRADESTATUS_FAIL.getCode()).equals(tradeStatus)) {
                updateNum = posOrderService.updateOrderStatus(updateMap);
                //考虑并发关闭订单问题
                if (updateNum == 0) {
                    //重新查找数据库最新记录
                    pod = posOrderService.queryOrderInfo(null, orderNo, pod.getMachineSn());
                    if (TradestatusEnum.TRADESTATUS_CLOSE.getCode().equals(pod.getTradeStatus().toString())) {
                        updateMap.put("oldTradeStatus", pod.getTradeStatus());
                        tradeStatus = pod.getTradeStatus();
                        updateNum = posOrderService.updateOrderStatus(updateMap);
                    }
                }
            }else {
                //原订单终态等于创建时,更新订单状态为处理中
                if (TradestatusEnum.TRADESTATUS_CREATE.getCode().equals(pod.getTradeStatus().toString())) {
                	updateNum = posOrderService.updateOrderStatus(updateMap);
                }
            }
        }
        if(updateNum != 0){
        	json.put("tradeStatus", tradeStatus);
        }
        logger.info("Json:"+json);
        return json;
    }*/
    
    /**
     * 支付返回等待页面
     * @param orderNo
     * @return
     */
    @RequestMapping("/wait/{orderNo}")
    public String redirectWait(@PathVariable String orderNo,Model model){
    	model.addAttribute("orderNo",orderNo);
    	return "wait";
    }
}
