package com.yy.tourweb.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * HttpUtils
 *
 * @author lufl
 * @date 2016/4/26
 */
public class HttpUtils {
    private static final AppLogger LOGGER = new AppLogger(HttpUtils.class);

    public static String requestRead(HttpServletRequest request) {
        try {
            byte[] data = requestReadByte(request);
            if (data != null) {
                return new String(data);
            }
        } catch (IOException e) {
            LOGGER.error("HttpUtils requestRead 读取请求信息系统异常：", e);
        }
        return null;
    }

    public static byte[] requestReadByte(HttpServletRequest request) throws IOException {
        int contentLength = request.getContentLength();
        byte[] data = null;
        if (contentLength > 1) {
            data = new byte[contentLength];
            InputStream is = request.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            dis.readFully(data);
            dis.close();
        }
        return data;
    }

    public static void writeResponse(HttpServletResponse response, ResponseVo<String> responseVo) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        byte[] out = JSON.toJSONString(responseVo).getBytes("UTF-8");
        response.getOutputStream().write(out);
        response.flushBuffer();
    }
    
    /**
     * 获取客户端ip
     * @param request
     */
    public static String getRemoteHost(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
    }

}
