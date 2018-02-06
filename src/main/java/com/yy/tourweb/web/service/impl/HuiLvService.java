package com.yy.tourweb.web.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.yy.tourweb.common.Constants;
import com.yy.tourweb.web.dao.IBaseDao;
import com.yy.tourweb.web.redis.RedisClientTemplate;
import com.yy.tourweb.web.service.IHuiLvService;
 
/**
*汇率调用示例代码 － 聚合数据
*在线接口文档：http://www.juhe.cn/docs/80
**/
@Service 
public class HuiLvService implements IHuiLvService{
	
	@Resource
	private IBaseDao baseDao;

	@Resource
	private RedisClientTemplate redisClient;
	
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
 
    //配置您申请的KEY
    public static final String APPKEY ="06ee342f540205a74b4ddab54059ab6c";
 
    //1.常用汇率查询
	/** 
	 * 获取美元汇率（4h更新一次 放入redis）
	 */
	@Override
	@SuppressWarnings("unchecked")
    public BigDecimal getUSDExchangeRate(){
		String exchangeRate = redisClient.get(Constants.REDIS_EXCHANGE_RATE);
		if(null == exchangeRate || "".equals(exchangeRate)){
			String result =null;
			String url ="http://op.juhe.cn/onebox/exchange/query";//请求接口地址
			Map<String, String> params = new HashMap<String, String>();//请求参数
			params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
			
			try {
				result =net(url, params, "GET");
				JSONObject object = JSONObject.parseObject(result);
				if(object.getIntValue("error_code")==0){
					System.out.println(object.get("result"));
					
					Map<String, Object> m = (Map<String, Object>) object.get("result");
					List<List<String>> ml = (List<List<String>>) m.get("list");
					
					outer:for(List<String> mml : ml){
						for(String str : mml){
							if("美元".equals(str)){
								exchangeRate = mml.get(5);
								break outer;
							}
						}
					}
					System.out.println("exchangeRate:"+exchangeRate);
					
					redisClient.set(Constants.REDIS_EXCHANGE_RATE, 60*60*4, exchangeRate);//4h更新一次
					/*SysDictDto sdd = new SysDictDto();
					BigDecimal rate = new BigDecimal(exchangeRate).movePointLeft(2);
					sdd.setId("120");
					sdd.setValue(String.valueOf(rate));
					baseDao.update(sdd);*/
				}else{
					System.out.println(object.get("error_code")+":"+object.get("reason"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return new BigDecimal(exchangeRate);
    }
 
    //2.货币列表
	@SuppressWarnings("unchecked")
    public static void getRequest2(){
        String result =null;
        String url ="http://op.juhe.cn/onebox/exchange/list";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
 
        try {
            result =net(url, params, "GET");
//            JSONObject object = JSONObject.fromObject(result);
            JSONObject object = JSONObject.parseObject(result);
            if(object.getIntValue("error_code")==0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    //3.实时汇率查询换算
	@SuppressWarnings("unchecked")
    public static void getRequest3(){
        String result =null;
        String url ="http://op.juhe.cn/onebox/exchange/currency";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("from","CNY");//转换汇率前的货币代码
            params.put("to","LKR");//转换汇率成的货币代码
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
 
        try {
            result =net(url, params, "GET");
//            JSONObject object = JSONObject.fromObject(result);
            JSONObject object = JSONObject.parseObject(result);
            if(object.getIntValue("error_code")==0){
                System.out.println(object.get("result"));
            }else{
                System.out.println(object.get("error_code")+":"+object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
 
 
    public static void main(String[] args) {
 
    	HuiLvService hs = new HuiLvService();
//    	hs.getUSDExchangeRate();
//    	hs.getRequest2();
    	hs.getRequest3();
    	
         /*BigDecimal rate = new BigDecimal("663.4600").movePointLeft(2);
         System.out.println(String.valueOf(rate));*/
    	
//    	String url ="http://op.juhe.cn/onebox/exchange/query";//请求接口地址
//		Map<String, String> params = new HashMap<String, String>();//请求参数
//		params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
//		
//		try {
//			String result =net(url, params, "GET");
//			JSONObject object = JSONObject.parseObject(result);
//			if(object.getIntValue("error_code")==0){
//				System.out.println(object.get("result"));
//				
//				Map<String, Object> m = (Map<String, Object>) object.get("result");
//				List<List<String>> ml = (List<List<String>>) m.get("list");
//				String exchangeRate="";
//				
//				outer:for(List<String> mml : ml){
//					for(String str : mml){
//						if("美元".equals(str)){
//							exchangeRate = mml.get(5);
//							break outer;
//						}
//					}
//				}
//				System.out.println("exchangeRate:"+exchangeRate);
//			}else{
//				System.out.println(object.get("error_code")+":"+object.get("reason"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
    }
 
    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map params,String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                        out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
 
    //将map型转为请求参数型
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}