package com.yy.tourweb.Interceptor;

import com.yy.tourweb.common.Constants;
import com.yy.tourweb.util.AppLogger;
import com.yy.tourweb.util.HttpUtils;
import com.yy.tourweb.util.ResponseVo;
import com.yy.tourweb.util.StringUtils;
import com.yy.tourweb.web.redis.RedisClientTemplate;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 提交次数限制
 *
 * @author yy
 * @date 2017/4/26
 */
public class SubmitTimeAppInterceptor implements HandlerInterceptor {
    private static final AppLogger LOGGER = new AppLogger(SubmitTimeAppInterceptor.class);
    private static final ThreadLocal<Long> THREAD_LOCAL = new ThreadLocal<Long>();
    @Resource
    private RedisClientTemplate redisClient;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        THREAD_LOCAL.set(startTime);
        ResponseVo<String> responseVo;
        try {
        	String clientIP = HttpUtils.getRemoteHost(request);
        	LOGGER.info("Client IP："+clientIP);
        	LOGGER.info("Client request URL："+request.getRequestURL());
        	if(request.getRequestURI().contains("/order/") || request.getRequestURI().contains("/submit/")){
        		String times = redisClient.get(Constants.REDIS_CLINET_IP+request.getRemoteAddr());
        		if(StringUtils.isNoneBlank(times) && Integer.parseInt(times) > 5){
        			responseVo = new ResponseVo<String>();
        			responseVo.setStatus(601);
        			responseVo.setMessage("Hi,you've submitted it five times in the last hour.Please continue to operate next hour!");
        			HttpUtils.writeResponse(response, responseVo);
        			LOGGER.info("1hour 提交表单次数超5次！");
        			return false;
        		}
        	}
        	/*if(request.getRequestURI().contains("/tour/")){
        		String requestParams = HttpUtils.requestRead(request);
                if (StringUtils.isBlank(requestParams)) {
                    LOGGER.info("请求参数不能为空");
                    responseVo = new ResponseVo<String>();
                    responseVo.setStatus(602);
        			responseVo.setMessage("The request params is empty!");
                    HttpUtils.writeResponse(response, responseVo);
                    return false;
                }
        	}*/
        	return true;
        } catch (Exception e) {
            LOGGER.error("解析请求数据异常：", e);
            responseVo = new ResponseVo<String>();
            responseVo.setStatus(500);
			responseVo.setMessage(e.getMessage());
            HttpUtils.writeResponse(response, responseVo);
            return false;
        }
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = THREAD_LOCAL.get();
        LOGGER.info("##请求url:" + request.getRequestURI() + "响应耗时：" + (System.currentTimeMillis() - startTime) + "ms");
    }

}
