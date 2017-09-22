package com.yy.tourweb.util;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.alibaba.fastjson.JSON;

/** 
 * @Description: 自定义log工具类 
 * @author yanghj
 * @date 2017年7月1日 下午5:24:12 
 *  
 */
public class AppLogger implements Serializable{

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 1L;
	
	private Logger logger;

	/**
	 * @param logger
	 */
	public AppLogger(Class<?> c) {
		this.logger = LogManager.getLogger(c);
	}
	
	public void debug(Object msg){
		if (logger.isDebugEnabled()) {
			if (msg instanceof String) {
				logger.debug(msg);
			}else {
				logger.debug(JSON.toJSONString(msg));
			}
		}
	}
	
	public void debug(Object msg, Throwable t) {
		if (logger.isDebugEnabled()) {
			if (msg instanceof String) {
				logger.debug(msg,t);
			}else {
				logger.debug(JSON.toJSONString(msg),t);
			}
		}
	}
	
	public void debug(String message, Object... params) {
		if (logger.isInfoEnabled()) {
			if (null==params) {
				logger.debug(message);
				return;
			}
			for (int i = 0; i < params.length; i++) {
				if(params[i] instanceof String){
					//字符串不转换JSON
				}else {
					params[i]=JSON.toJSONString(params[i]);
				}
			}
			logger.debug(message,params);
		}
	}
	
	public void info(Object msg){
		if (logger.isInfoEnabled()) {
			if (msg instanceof String) {
				logger.info(msg);
			}else {
				logger.info(JSON.toJSONString(msg));
			}
		}
	}
	
	public void info(Object msg, Throwable t) {
		if (logger.isInfoEnabled()) {
			if (msg instanceof String) {
				logger.info(msg,t);
			}else {
				logger.info(JSON.toJSONString(msg),t);
			}
		}
	}
	
	public void info(String message, Object... params) {
		if (logger.isInfoEnabled()) {
			if (null==params) {
				logger.info(message);
				return;
			}
			for (int i = 0; i < params.length; i++) {
				if(params[i] instanceof String){
					//字符串不转换JSON
				}else {
					params[i]=JSON.toJSONString(params[i]);
				}
			}
			logger.info(message,params);
		}
	}
	
	public void error(Object message) {
		if (message instanceof String) {
			logger.error(message);
		}else {
			logger.error(JSON.toJSONString(message));
		}
	}
	
	public void error(Object msg, Throwable t) {
		if (msg instanceof String) {
			logger.error(msg,t);
		}else {
			logger.error(JSON.toJSONString(msg),t);
		}
	}
}
