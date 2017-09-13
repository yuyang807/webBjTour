package com.yy.tourweb.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

/**
 * 
 * @author chenhao 2015年9月10日 上午11:11:58
 */
public class PropertiesUtil {
//    private static AppLogger logger = new AppLogger(PropertiesUtil.class);
    public static String getValue(String bundle, String key) {
        try {
            ResourceBundle rb = ResourceBundle.getBundle(bundle);
            return rb.getString(key);
        } catch (Exception e) {
//            logger.error("PropertiesUtil getValue error", e);
            return null;
        }
    }
    
    /**
     * 格式化卡号    ***** 1233
     * @param cardNo
     * @return
     */
    public static String formatCardNo(String cardNo){
        String ret = "";
        if(StringUtils.isEmpty(cardNo)){
            return "";
        }
        if(cardNo.length()>4){
            ret = String.format("%s%s%s", "****"," ", cardNo.substring(cardNo.length() - 4));
        }else{
            ret = String.format("%s%s%s", "****"," ", cardNo);
        }
        return ret;
        
       
    }
    
    /**
     * 格式化卡号  中间八个*
     * @param cardNo
     * @return
     */
    public static String formatCardNoTypeTwo(String cardNo){
        if(cardNo.length() <= 8){
            return cardNo;
        }
        String start = cardNo.substring(0, 6);
        String end = cardNo.substring(cardNo.length() - 4, cardNo.length());
        String result = start + "*********" + end;
        return result;
    }
    
    /**
     * 格式化手机号    ***** 1233
     * @param telephone
     * @return
     */
    public static String formatTelephone(String telephone){
        String ret = "";
        if(StringUtils.isEmpty(telephone)){
            return "";
        }
        if(telephone.length()>4){
            ret = String.format("%s%s%s", "****", telephone.substring(3,telephone.length() - 4) ,"****");
        }else{
            ret = String.format("%s%s%s", "****"," ", telephone);
        }
        return ret;
    }
    
    public static String formatIdCardNo(String idCardNo){
        if(StringUtils.isEmpty(idCardNo)){
            return "";
        }
        if(idCardNo.length()<4){
            return idCardNo;
        }
        String showIdCardNo = String.format("%s%s%s", idCardNo.substring(0,2) , "****************" ,idCardNo.substring(idCardNo.length()-2));
        return showIdCardNo;
    }
    
    
    /**
     * 格式化手机号    151****1233
     * @param telephone
     * @return
     */
    public static String LongFormatTelephone(String telephone){
        String ret = "";
        if(StringUtils.isEmpty(telephone)){
            return "";
        }
        if(telephone.length()>4){
            ret = String.format("%s%s%s", telephone.substring(0,3) ,"****",telephone.substring(telephone.length() - 4));
        }else{
            ret = String.format("%s%s%s", "****"," ", telephone);
        }
        return ret;
    }
    
    /**
     * 校验日期格式
     * @param pattern 校验格式yyyyMMdd
     * @param date 字符串格式日期
     * @return
     */
    public static boolean isValidDate(String pattern,String date){
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        try {
            sdf.setLenient(false);
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(formatCardNoTypeTwo("6230790019900683260"));
    }
}
