package com.yy.tourweb.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/** 
 * @Description: 统一异常处理 
 * @author yy
 * @date 2017年7月1日 上午11:33:38 
 *  
 */
public class CommonExceptionResolver implements HandlerExceptionResolver {
	
	private static Logger logger = LoggerFactory.getLogger(CommonExceptionResolver.class);
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		logger.error("系统异常",ex);
		return new ModelAndView("error");
	}

}
