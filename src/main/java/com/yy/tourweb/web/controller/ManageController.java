package com.yy.tourweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yy.tourweb.common.Constants;
import com.yy.tourweb.util.AppLogger;
import com.yy.tourweb.util.DateUtil;
import com.yy.tourweb.util.EmailUtil;
import com.yy.tourweb.util.HttpUtils;
import com.yy.tourweb.web.dto.TAdviceDto;
import com.yy.tourweb.web.dto.TCarkindDto;
import com.yy.tourweb.web.dto.TCarkindServiceDto;
import com.yy.tourweb.web.dto.TCarserviceDto;
import com.yy.tourweb.web.dto.TGuideDto;
import com.yy.tourweb.web.dto.TMemberDto;
import com.yy.tourweb.web.dto.TOrderDto;
import com.yy.tourweb.web.dto.TPicDto;
import com.yy.tourweb.web.dto.TShowDto;
import com.yy.tourweb.web.service.IAdditionService;
import com.yy.tourweb.web.service.IBaseService;
import com.yy.tourweb.web.service.ILineService;


import com.yy.tourweb.web.service.IMemberService;
import com.yy.tourweb.web.service.IPicService;
import com.yy.tourweb.web.service.ISeqService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 页面跳转Controller
 * @author yy 2017-2-24
 * 
 */
@Controller
public class ManageController {
	private static AppLogger logger = new AppLogger(ManageController.class);
	
	@Resource
	private IBaseService baseService;
	@Resource
	private ILineService lineService;
	@Resource
	private IPicService picService;
	@Resource
	private IAdditionService additionService;
	@Resource
    private ISeqService seqService;
	@Resource
	private IMemberService memberService;
	
    /**
     * 首页展示
     * @param request
     * @param model
     */
    @RequestMapping("/")
    public String showMain(HttpServletRequest request, Model model) {
    	//查询redis中首页大图url
    	
    	//查询首页权重前12的线路list(包含：首页图url→上传图时对首页图进行等比压缩？line_no、名称、类型、价格、天数)
    	
    	List<TPicDto> plist = picService.queryMainPicList();//先走redis查询，没有再查数据库
    	List<Map<String,Object>> llist = lineService.queryLineList(0);//先走redis查询，没有再查数据库
    	
		model.addAttribute("lineList", JSONArray.toJSON(llist));
    	model.addAttribute("picList", JSONArray.toJSON(plist));
		return "home";	
    }
    
    /**
     * 产品列表页
     * @param request
     * @param model
     */
    @RequestMapping("/list")
    public String showList(HttpServletRequest request, Model model) {
    	List<Map<String,Object>> llist = lineService.queryLineList(1);//先走redis查询，没有再查数据库
		model.addAttribute("lineList", JSONArray.toJSON(llist));
		return "viewTheTour";	
    }
    
    @RequestMapping("/list/{lineNo}")
    public String queryOneLine(@PathVariable String lineNo,Model model){
    	//线路信息与图片 价格信息
    	//优化方案：异步请求相似线路
    	try {
			List<Map<String,Object>> oneLine = lineService.queryOneLine(lineNo);//先走redis查询，没有再查数据库
			model.addAttribute("oneLine", JSONArray.toJSON(oneLine));
		} catch (Exception e) {
			logger.error("根据编号查询线路异常！",e);;
			return "error";
		}
    	
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("lineNo", lineNo);
    	params.put("urlFront", Constants.PIC_FRONT_URL);
    	List plist = baseService.queryListByMap("TPicDto.queryPicByLineNo", params);
    	List<Map<String,Object>> addList   = additionService.queryLineAddition(lineNo, 0);
    	List<Map<String,Object>> unaddlist = additionService.queryLineAddition(lineNo, 1);
    	
    	List<Map<String,Object>> llist = lineService.queryRandom3();
    	model.addAttribute("plist", JSONArray.toJSON(plist));
    	model.addAttribute("lineList", JSONArray.toJSON(llist));
    	model.addAttribute("addList", JSONArray.toJSON(addList));
    	model.addAttribute("unaddList", JSONArray.toJSON(unaddlist));
    	
    	return "tourDetails";
    }
    
    @RequestMapping("/tour/basket")
    public String preShopping(TOrderDto tod,Model model){
//    	System.out.println(adultNum);
    	System.out.println(tod.getAdultNum());
    	//根据lineNo查询线路名称、url
    	//根据lineNo与人数 查询单价
    	//查询所有表演内容
    	//查询所有车辆内容
    	
    	int totalNum = tod.getAdultNum()+tod.getTeenagerNum()+tod.getChildNum();
    	List<Map<String, Object>> tldList = lineService.queryOneLine(String.valueOf(tod.getLineNo()));
    	Map<String,Object> tldMap = tldList.get(0);
    	String unitPrice = String.valueOf(getUnitPrice(totalNum,tldMap));
    	model.addAttribute("lineNo", tod.getLineNo());
    	model.addAttribute("adultNum", tod.getAdultNum());
    	model.addAttribute("teenagerNum", tod.getTeenagerNum());
    	model.addAttribute("childNum", tod.getChildNum());
    	model.addAttribute("babyNum", tod.getBabyNum());
    	model.addAttribute("startDate", tod.getStartDate());
    	model.addAttribute("lineName", tldMap.get("lineName"));
    	model.addAttribute("mainPicUrl", tldMap.get("mainPicUrl"));
    	model.addAttribute("unitPrice", unitPrice);
    	
    	List<TShowDto> showList = (List<TShowDto>)(List) baseService.queryListByDto(new TShowDto());
    	Map<String, Object> carPmap = new HashMap<String, Object>();
    	carPmap.put("urlFront", Constants.PIC_FRONT_URL);
    	List<Map<String, Object>>  carList  = baseService.queryByMap("TCarkindDto.queryCarAllInfo", carPmap);
    	model.addAttribute("showList", JSONArray.toJSON(showList));
    	model.addAttribute("carList", JSONArray.toJSON(carList));
    	
    	return "payCopy";
    }
    
    @RequestMapping("/tour/confirm")
    public String confirmOrder(TOrderDto tod,Model model){
    	//根据lineNo查询线路名称、url
    	//根据lineNo与人数 查询单价
    	//查询所选对应两个节目的信息
    	//查询所选车辆的信息
    	
    	int totalNum = (tod.getAdultNum()==null?0:tod.getAdultNum())+(tod.getTeenagerNum()==null?0:tod.getTeenagerNum())+(tod.getChildNum()==null?0:tod.getChildNum());
    	List<Map<String, Object>> tldList = lineService.queryOneLine(String.valueOf(tod.getLineNo()));
    	Map<String,Object> tldMap = tldList.get(0);
    	String unitPrice = String.valueOf(getUnitPrice(totalNum,tldMap));
    	model.addAttribute("lineNo", tod.getLineNo());
    	model.addAttribute("adultNum", tod.getAdultNum());
    	model.addAttribute("teenagerNum", tod.getTeenagerNum());
    	model.addAttribute("childNum", tod.getChildNum());
    	model.addAttribute("babyNum", tod.getBabyNum());
    	model.addAttribute("startDate", Long.parseLong(tod.getStartDate())/1000);
    	model.addAttribute("lineName", tldMap.get("lineName"));
    	model.addAttribute("mainPicUrl", tldMap.get("mainPicUrl"));
    	model.addAttribute("unitPrice", unitPrice);
    	
    	TShowDto tsd1 = null;
    	TShowDto tsd2 = null;
    	int showPrice1 = 0;
    	int showPrice2 = 0; 
    	if(tod.getShowNo1() != null){
    		tsd1 = new TShowDto();
    		tsd1.setShowNo(tod.getShowNo1());
    		tsd1= (TShowDto) baseService.query(tsd1);
    		showPrice1 = tsd1.getShowPrice();
    	}
    	if(tod.getShowNo2() != null){
    		tsd2 = new TShowDto();
    		tsd2.setShowNo(tod.getShowNo2());
    		tsd2= (TShowDto) baseService.query(tsd2);
    		showPrice2 = tsd2.getShowPrice();
    	}
    	int showPrice1Total = showPrice1*(tod.getAdultNum()+tod.getTeenagerNum()+tod.getChildNum()+tod.getBabyNum());
    	int showPrice2Total = showPrice2*(tod.getAdultNum()+tod.getTeenagerNum()+tod.getChildNum()+tod.getBabyNum());
    	model.addAttribute("showNo1", tod.getShowNo1());
    	model.addAttribute("showPrice1", showPrice1Total);
    	model.addAttribute("showNo2", tod.getShowNo2());
    	model.addAttribute("showPrice2", showPrice2Total);
    	
    	TCarkindDto tcd1 = null;
    	TCarkindDto tcd2 = null;
    	int pickupPrice  = 0;
    	int dropoffPrice = 0; 
    	if(tod.getPickupCarTypeNo() != null){
    		tcd1 = new TCarkindDto();
    		tcd1.setCarTypeNo(tod.getPickupCarTypeNo());
    		tcd1= (TCarkindDto) baseService.query(tcd1);
    		pickupPrice = tcd1.getTransferPrice();
    	}
    	if(tod.getDropoffCarTypeNo() != null){
    		tcd2 = new TCarkindDto();
    		tcd2.setCarTypeNo(tod.getDropoffCarTypeNo());
    		tcd2= (TCarkindDto) baseService.query(tcd2);
    		dropoffPrice = tcd2.getTransferPrice();
    	}
    	model.addAttribute("pickupCarTypeNo", tod.getPickupCarTypeNo());
    	model.addAttribute("pickupPrice", pickupPrice);
    	model.addAttribute("dropoffCarTypeNo", tod.getDropoffCarTypeNo());
    	model.addAttribute("dropoffPrice", dropoffPrice);
    	model.addAttribute("flag", "1");
    	
    	return "cardPay";
    }
    
    @RequestMapping("/tour/order/submit")
    public @ResponseBody Object submitOrder(HttpServletRequest request,@RequestBody Map<String, Object> omd){
    	
    	//每种情况里 都要先算钱，除了判断钱的防篡改外 还需要添加总价参数
    	//线路里 节目总价+接送机总价+线路价钱
    	//车里 车*天数=总价  → 先找单价
    	//导游 导游*天数=总价
    	
    	//orderType外
    	//每种校验完价格后，录入会员(状态为不可用) 返回会员ID → 会员ID的生成
    	//订单信息set会员ID 插入订单+更新会员状态为可用
    	//跳转首页
    	
    	TOrderDto tod  = JSONObject.parseObject(omd.get("tod").toString(),TOrderDto.class);
    	TMemberDto tmd = JSONObject.parseObject(omd.get("tmd").toString(),TMemberDto.class);
    	
    	Map<String, String> resultMap = new HashMap<String, String>();
    	String subject = "";
    	String content = "";
    	Integer orderType = tod.getOrderType()==null?0:tod.getOrderType();
    	
    	String lineNo = String.valueOf(tod.getLineNo());
    	BigDecimal totalCountPrice = new BigDecimal(0);
    	MathContext mc = new MathContext(1,RoundingMode.HALF_UP);
    	if(1 == orderType){//lines
    		int totalPriceNum  = tod.getAdultNum()+tod.getTeenagerNum()+tod.getChildNum();
    		int totalPeopleNum = totalPriceNum + tod.getBabyNum();
    		List<Map<String, Object>> tldList = lineService.queryOneLine(String.valueOf(tod.getLineNo()));
    		Map<String,Object> tldMap = tldList.get(0);
    		int unitPrice = getUnitPrice(totalPriceNum,tldMap);
    		BigDecimal lineAdultPrice    = new BigDecimal(tod.getAdultNum()*unitPrice);
    		BigDecimal lineTeenagerPrice = new BigDecimal(tod.getTeenagerNum()*unitPrice);
    		BigDecimal lineChildPrice    = new BigDecimal(tod.getChildNum()*unitPrice).multiply(new BigDecimal(0.95,mc));
    		BigDecimal lineTotalPrice = lineAdultPrice.add(lineTeenagerPrice).add(lineChildPrice);
    		
    		TShowDto tsd1 = null;
    		String tsd1rows = "";
    		TShowDto tsd2 = null;
    		String tsd2rows = "";
    		int showPrice = 0;
    		if(tod.getShowNo1() != null){
    			tsd1 = new TShowDto();
    			tsd1.setShowNo(tod.getShowNo1());
    			tsd1= (TShowDto) baseService.query(tsd1);
    			showPrice = tsd1.getShowPrice();
    			tsd1rows = tsd1.getRows();
    		}
    		if(tod.getShowNo2() != null){
    			tsd2 = new TShowDto();
    			tsd2.setShowNo(tod.getShowNo2());
    			tsd2= (TShowDto) baseService.query(tsd2);
    			showPrice += tsd2.getShowPrice();
    			tsd2rows = tsd2.getRows();
    		}
    		int showTotalPrice = showPrice*totalPeopleNum;
    		
    		
    		TCarkindDto tcd1 = null;
    		String carType1 =  "";
    		TCarkindDto tcd2 = null;
    		String carType2 =  "";
    		int car_price = 0; 
    		if(tod.getPickupCarTypeNo() != null){
    			tcd1 = new TCarkindDto();
    			tcd1.setCarTypeNo(tod.getPickupCarTypeNo());
    			tcd1= (TCarkindDto) baseService.query(tcd1);
    			car_price = tcd1.getTransferPrice();
    			carType1 = tcd1.getCarTypeName();
    		}
    		if(tod.getDropoffCarTypeNo() != null){
    			tcd2 = new TCarkindDto();
    			tcd2.setCarTypeNo(tod.getDropoffCarTypeNo());
    			tcd2= (TCarkindDto) baseService.query(tcd2);
    			car_price += tcd2.getTransferPrice();
    			carType2 = tcd2.getCarTypeName();
    		}
    		
    		totalCountPrice = lineTotalPrice.add(new BigDecimal(showTotalPrice)).add(new BigDecimal(car_price));
    		List<Map<String,Object>> oneLine = new ArrayList<Map<String,Object>>();
    		try {
    			oneLine = lineService.queryOneLine(lineNo);//先走redis查询，没有再查数据库
    		} catch (Exception e) {
    			logger.error("根据编号查询线路异常！",e);;
    			resultMap.put("resCode", "ERR1002");
    			resultMap.put("resMsg", "The state of the line is not currently available!Please try again or contact us!We will contact you as soon as possible!");
    			return resultMap;
    		}
    		
    		subject = DateUtil.getDateStrBylong(tod.getStartDate())+"号有新线路订单了！";
    		content = "IP:"+HttpUtils.getRemoteHost(request)+" \n 线路编号： "+tod.getLineNo()+"\n 线路名称："+oneLine.get(0).get("lineName")+"\n 出行时间："+DateUtil.getDateStrBylong(tod.getStartDate())
    				+" \n 预订成人数："+tod.getAdultNum()+";Teenager："+tod.getTeenagerNum()+"；Child："+tod.getChildNum()+"；Baby："+tod.getBabyNum()
    				+" \n \n 接机/站车型："+carType1+"座 \n 送机/站车型："+carType2+"座 \n \n 杂技排数："+tsd1rows+"\n 功夫排数："+tsd2rows
    				+" \n \n 联系人："+tmd.getFName()+" "+tmd.getLName()+"\n Email："+tmd.getEmailAddress()+"\n 护照编号："+tmd.getPassportNum()
    				+" \n 下榻酒店："+tod.getHotelName()+"\n 酒店地址："+tod.getHotelAddress()+"\n \n 到达航班号："+tod.getAAirplanNum()
    				+" \n 离开航班号："+tod.getDAirplanNum()+"\n 预计开始行程时间："+DateUtil.getTimeStrBylong(tod.getStartTime())+"\n \n 备注："+tod.getInstructions()
    				+" \n \n 总价："+totalCountPrice.toString();
    		
    	}else if(2 == orderType){//cars
    		lineNo = String.valueOf(tod.getCarServiceNo());//为生成订单号
    		TCarserviceDto tcsd = new TCarserviceDto();
    		tcsd.setCarServiceNo(tod.getCarServiceNo());
    		tcsd = (TCarserviceDto) baseService.query(tcsd);//为了查询是否是多天的标识
    		
    		TCarkindServiceDto tcksd = new TCarkindServiceDto();
    		tcksd.setCarTypeNo(tod.getCarTypeNo());
    		tcksd.setCarServiceNo(tod.getCarServiceNo());
    		tcksd = (TCarkindServiceDto) baseService.query(tcksd);
    		
    		totalCountPrice = new BigDecimal(tcksd.getCarServicePrice());
    		if(1 == tcsd.getCanManyDays()){
    			totalCountPrice = totalCountPrice.multiply(new BigDecimal(tod.getCarDay()), mc);
    		}
    		
    		subject = DateUtil.getDateStrBylong(tod.getStartDate())+"号有新订车订单了！";
    		String startDateStr = DateUtil.getDateStrBylong(tod.getStartDate());
    		content = "IP:"+HttpUtils.getRemoteHost(request)+" \n 汽车服务名称："+tcsd.getCarServiceName()+"\n 出行时间："+startDateStr+"\n 结束时间："+DateUtil.DToSLine(DateUtil.addDay(DateUtil.SLineToD(startDateStr), tod.getCarDay()))
    				+" \n \n 联系人："+tmd.getFName()+" "+tmd.getLName()+"\n Email："+tmd.getEmailAddress()+"\n 护照编号："+tmd.getPassportNum()
    				+" \n 下榻酒店："+tod.getHotelName()+"\n 酒店地址："+tod.getHotelAddress()+"\n \n 到达航班号："+tod.getAAirplanNum()
    				+" \n 离开航班号："+tod.getDAirplanNum()+"\n 预计开始行程时间："+DateUtil.getTimeStrBylong(tod.getStartTime())+"\n \n 备注："+tod.getInstructions()
    				+" \n \n 总价："+totalCountPrice.toString();
    		
    	}else if(3 == orderType){//guides
    		lineNo = String.valueOf(tod.getGuideNo());//为生成订单号
    		TGuideDto tgd = new TGuideDto();
    		tgd.setGuideNo(tod.getGuideNo());
    		tgd = (TGuideDto) baseService.query(tgd);
    		totalCountPrice = new BigDecimal(tgd.getPrice());
    		if(701 != tod.getGuideNo()){
    			totalCountPrice = totalCountPrice.multiply(new BigDecimal(tod.getGuideDay(),mc));
    		}
    		
    		subject = DateUtil.getDateStrBylong(tod.getStartDate())+"号有新订导游订单了！";
    		String startDateStr = DateUtil.getDateStrBylong(tod.getStartDate());
    		content = "IP:"+HttpUtils.getRemoteHost(request)+" \n 导游服务名称："+tgd.getServiceName()+"\n 出行时间："+startDateStr+"\n 结束时间："+DateUtil.DToSLine(DateUtil.addDay(DateUtil.SLineToD(startDateStr), tod.getGuideDay()))
    				+" \n \n 联系人："+tmd.getFName()+" "+tmd.getLName()+"\n Email："+tmd.getEmailAddress()+"\n 护照编号："+tmd.getPassportNum()
    				+" \n 下榻酒店："+tod.getHotelName()+"\n 酒店地址："+tod.getHotelAddress()+"\n \n 到达航班号："+tod.getAAirplanNum()
    				+" \n 离开航班号："+tod.getDAirplanNum()+"\n 预计开始行程时间："+DateUtil.getTimeStrBylong(tod.getStartTime())+"\n \n 备注："+tod.getInstructions()
    				+" \n \n 总价："+totalCountPrice.toString();
    	}else{
    		resultMap.put("resCode", "ERR1003");
    		resultMap.put("resMsg", "Page request parameter error!Please try again or contact us!We will contact you as soon as possible!");
    		return resultMap;
    	}
    	
    	if(totalCountPrice.compareTo(new BigDecimal(tod.getTotalPrice())) != 0){
    		resultMap.put("resCode", "ERR1001");
    		resultMap.put("resMsg", "The total price has been manipulated!Please try again or contact us!We will contact you as soon as possible!");
    		return resultMap;
    	}
    	
    	//先查询是否已有会员信息 如果没有 录入会员信息；如果有 得到会员编号
//    	TMemberDto existMember = new TMemberDto();
//    	existMember.setEmailAddress(tmd.getEmailAddress());
//    	//前台Ajax校验在先 这个肯定没有重复的 都是直接插入。Ajax校验时 如果已有信息 应提示。想要获取之前的信息 应去邮箱去确认链接才行！没有Ajax时 直接插入 不做邮箱校验
    	//UNIQUE KEY `index_email` (`email_address`) USING BTREE,
//    	existMember = (TMemberDto) baseService.query(existMember);
    	
    	Integer memberNo = null;
//    	if(existMember == null){
    		//查询最大mem_no+1
    		memberNo = (Integer) baseService.queryObjectByMap("TMemberDto.queryNextMemNo", new HashMap<String, Object>());
    		tmd.setMemberNo(memberNo);
    		baseService.insert(tmd);
//    	}else{
//    		memberNo = existMember.getMemberNo();
//    	}
    	
    	//获取订单号
    	String orderNo = seqService.getNewOrderNo(lineNo);
    	tod.setOrderNo(orderNo);
    	tod.setMemberNo(memberNo);
    	int order_count  = baseService.insert(tod);
    	int update_count = 0;
    	if(order_count > 0){
    		tmd.setStatus(1);
    		update_count = baseService.update(tmd);
    		resultMap.put("resCode", "00000000");
    		resultMap.put("resMsg", orderNo);
    	}
    	
    	//发邮件
    	if(update_count > 0){
    		logger.info(content);
    		String[] emailTo = Constants.ORDER_EMAIL.split(",");
    		try {
    			EmailUtil.sendEmail(subject, emailTo, content);
    		} catch (Exception e) {
    			logger.error("发送电邮邮件通知异常！", e);
    		}
    	}
    	
    	return resultMap;
    }
    
    
    private int getUnitPrice(int totalNum, Map<String, Object> tldMap) {
    	int up = 0;
		if(totalNum == 1){
			up = (Integer)tldMap.get("oneP");
		}else if(totalNum == 2){
			up = (Integer)tldMap.get("twoP");
		}else if(totalNum == 3){
			up = (Integer)tldMap.get("threeP");
		}else if(totalNum == 4){
			up = (Integer)tldMap.get("fourP");
		}else if(totalNum == 5){
			up = (Integer)tldMap.get("fiveP");
		}else if(totalNum == 6){
			up = (Integer)tldMap.get("sixP");
		}else if(totalNum == 7){
			up = (Integer)tldMap.get("sevenP");
		}else if(totalNum == 8){
			up = (Integer)tldMap.get("eightP");
		}else if(totalNum == 9){
			up = (Integer)tldMap.get("nineP");
		}else if(totalNum == 10){
			up = (Integer)tldMap.get("tenP");
		}
		return up;
	}

    @RequestMapping("/list/guides")
    public String redirectGuides(Model model){
    	List<TGuideDto> guidesList = (List<TGuideDto>)(List) baseService.queryListByDto(new TGuideDto());
    	model.addAttribute("guidesList", JSONArray.toJSON(guidesList));
    	return "tourGuide";
    } 
    
    @RequestMapping("/list/cars")
    public String redirectCars(Model model){
    	Map<String, Object> carMap = new HashMap<String, Object>();
    	carMap.put("urlFront", Constants.PIC_FRONT_URL);
    	List<Map<String, Object>> carsList = baseService.queryByMap("TCarkindDto.queryCarAllInfo", carMap);
    	model.addAttribute("carsList", JSONArray.toJSON(carsList));
    	List<Map<String, Object>> serviceList = baseService.queryByMap("TCarserviceDto.queryListMap", new HashMap<String, Object>());
    	model.addAttribute("serviceList", JSONArray.toJSON(serviceList));
    	return "carRental";
    } 
    
    @RequestMapping("/advice")
    public String redirectContact(Model model){
    	return "contactUs";
    } 
    
    /**
     * 提交咨询信息
     * @param request
     * @param tad
     */
    @RequestMapping("/advice/submit")
    @ResponseBody
    public Object submitAdvice(HttpServletRequest request,TAdviceDto tad){
    	JSONObject json = new JSONObject();
    	//发邮件
    	String subject = "您有一条来自"+tad.getLName()+"咨询信息";
		String content = "IP:"+HttpUtils.getRemoteHost(request)+" \n 名字："+tad.getLName()+" \n 联系邮箱： "+tad.getEmailAddress()+"\n 提问时间："+DateUtil.getCurrentDateTime()+"\n 咨询内容："+tad.getContent();
		logger.info(content);
		String[] emailTo = Constants.ORDER_EMAIL.split(",");
		int emailFlag = 0;
		try {
			EmailUtil.sendEmail(subject, emailTo, content);
			emailFlag = 1;
		} catch (Exception e) {
			logger.error("发送咨询信息提醒邮件异常！", e);
		}
    	
    	tad.setIsInform(emailFlag);
    	String clientIP = HttpUtils.getRemoteHost(request);
    	String[] ipsArray = clientIP.split("\\.");
    	tad.setIp1(Integer.valueOf(ipsArray[0]));
    	tad.setIp2(Integer.valueOf(ipsArray[1]));
    	tad.setIp3(Integer.valueOf(ipsArray[2]));
    	tad.setIp4(Integer.valueOf(ipsArray[3]));
    	
    	baseService.insert(tad);
    	json.put("resultCode", "00000000");
    	
    	return json;
    }
    
    /**
     * 提交预订导游信息
     * @param request
     * @param tod
     */
    @RequestMapping("/guides/confirm")
    public String confirmGuides(TOrderDto tod, Model model){
    	TGuideDto tgd = new TGuideDto();
    	tgd.setGuideNo(tod.getGuideNo());
    	tgd = (TGuideDto) baseService.query(tgd);//校验是否有这个参数 否则全查出来会报错
    	
    	model.addAttribute("startDate",tod.getStartDate());
    	model.addAttribute("guideDay",tod.getGuideDay());
    	model.addAttribute("guideNo",tod.getGuideNo());
    	model.addAttribute("serciceName",tgd.getServiceName());
    	model.addAttribute("unitPrice", tgd.getPrice());
    	model.addAttribute("flag","3");
    	
    	return "cardPay";
    }
    
    /**
     * 提交预订车信息
     * @param request
     * @param tod
     */
    @RequestMapping("/cars/confirm")
    public String confirmCars(TOrderDto tod, Model model){
    	TCarkindDto tckd = new TCarkindDto();
    	tckd.setCarTypeNo(tod.getCarTypeNo());
    	tckd = (TCarkindDto) baseService.query(tckd);
    	
    	model.addAttribute("startDate",tod.getStartDate());
    	model.addAttribute("carTypeNo",tod.getCarTypeNo());
    	model.addAttribute("carDay",tod.getCarDay());
    	model.addAttribute("carTypeName",tckd.getCarTypeName());
    	model.addAttribute("flag","2");
    	TCarserviceDto tcsd = new TCarserviceDto();
    	tcsd.setCarServiceNo(tod.getCarServiceNo());
    	tcsd = (TCarserviceDto) baseService.query(tcsd);
    	model.addAttribute("carServiceNo", tod.getCarServiceNo());
    	model.addAttribute("carServiceName", tcsd.getCarServiceName());
    	
    	TCarkindServiceDto tcksd = new TCarkindServiceDto();
    	tcksd.setCarServiceNo(tod.getCarServiceNo());
    	tcksd.setCarTypeNo(tod.getCarTypeNo());
    	tcksd = (TCarkindServiceDto) baseService.query(tcksd);
    	model.addAttribute("unitPrice", tcksd.getCarServicePrice());
    	
    	return "cardPay";
    }
    
    public static void main(String[] args) {
    	MathContext mc = new MathContext(2,RoundingMode.HALF_UP);
    	BigDecimal lineAdultPrice = new BigDecimal(4*56).multiply(new BigDecimal(0.8,mc));
    	System.out.println(lineAdultPrice);
	}
    
}
