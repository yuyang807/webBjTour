package com.yy.tourweb.Interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yy.tourweb.common.JsonObject;

public class JsonObjectArgResolverHandler implements HandlerMethodArgumentResolver {
	 
	//只支持解析带有JsonObject的对象解析
    @Override 
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(JsonObject.class);
    }
 
    @Override 
    public Object resolveArgument(MethodParameter methodParameter,
        ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest,
        WebDataBinderFactory webDataBinderFactory) throws Exception {
        try {
            JSONObject para = getRequestInfo(nativeWebRequest);
            Class<?> type = methodParameter.getParameterType();
            String name = methodParameter.getParameterName();
            if (null != para && para.containsKey(name)) {
                return JSON.parseObject(para.getString(name), type);
            }
        } catch (Exception e) {
        }
        return null;
    }
 
 
 
    private JSONObject getRequestInfo(NativeWebRequest webRequest) throws IOException {
        JSONObject para = new JSONObject();
        HttpServletRequest httpServletRequest =
            (HttpServletRequest) webRequest.getNativeRequest(HttpServletRequest.class);
        String method = httpServletRequest.getMethod();
        if (!method.equals("GET") && !method.equals("DELETE")) {
 
            if (null != httpServletRequest.getAttribute("para")) {
                try {
                    para = JSON.parseObject(httpServletRequest.getAttribute("para").toString());
                } catch (Exception e) {
                }
            } else {
                StringBuilder buffer = new StringBuilder();
                BufferedReader reader = httpServletRequest.getReader();
                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
                //httpServletRequest的body体只能读取一次，再次读取后就返回空，因为带有JsonObject注解的对象都会执行一遍，在第一次获取后需要将body体保存下来，以便下次使用。
                httpServletRequest.setAttribute("para", buffer.toString());
 
                try {
                    para = JSON.parseObject(buffer.toString());
                } catch (Exception e) {
                }
            }
        } else {
            Map<String, String[]> parameterMap = webRequest.getParameterMap();
            for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
                String key = entry.getKey();
                String values = StringUtils.join(entry.getValue());
                para.put(key, values);
            }
        }
        return para;
    }
 
}