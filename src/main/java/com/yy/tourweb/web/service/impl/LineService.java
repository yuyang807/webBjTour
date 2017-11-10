package com.yy.tourweb.web.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.yy.tourweb.common.Constants;
import com.yy.tourweb.util.AppLogger;
import com.yy.tourweb.util.StringUtils;
import com.yy.tourweb.web.dao.IBaseDao;
import com.yy.tourweb.web.redis.RedisClientTemplate;
import com.yy.tourweb.web.service.ILineService;

/**
 * 线路service
 * @author yy
 *
 */
@Service
public class LineService implements ILineService{
	private static AppLogger logger = new AppLogger(LineService.class);
	@Resource
	private RedisClientTemplate redisClient;

	@Resource
	private IBaseDao baseDao;
	
	@Override
	public List<Map<String,Object>> queryLineList(int isMain){
		Map<String, Object> params=new HashMap<String, Object>();
		String resultStr = "";
		List list = null;
		String key = "";
		
		if(isMain == 0){//为首页
			key = Constants.REDIS_LINE_MAIN;
			resultStr = redisClient.get(key);
			params.put("limit", 12);
		}else{
			key = Constants.REDIS_LINE_ALL;
			resultStr = redisClient.get(key);
		}
		if(StringUtils.isBlank(resultStr)){
			params.put("urlFront", Constants.PIC_FRONT_URL);
			list = baseDao.queryByMap("TLineDto.queryLines", params);
			String jsonStr = JSONArray.toJSONString(list);
			redisClient.set(key,3600*3, jsonStr);
		}else{
			list = JSONArray.parseObject(resultStr,List.class);
		}
		
        return list;
	}

	@Override
	public List<Map<String, Object>> queryOneLine(String lineNo) {
		String resultStr = "";
		List list = null;
		resultStr = redisClient.get(Constants.REDIS_LINE_ID+lineNo);
		if(StringUtils.isBlank(resultStr)){
			Map<String, Object> params=new HashMap<String, Object>();
			try {
				params.put("lineNo", Integer.parseInt(lineNo));
			} catch (NumberFormatException e) {
				logger.error("传入lineNo异常："+lineNo, e);
				return null;
			}
			params.put("urlFront", Constants.PIC_FRONT_URL);
			list = baseDao.queryByMap("TLineDto.queryOneLine", params);
			String jsonStr = JSONArray.toJSONString(list);
			redisClient.set(Constants.REDIS_LINE_ID+String.valueOf(lineNo),3600*3, jsonStr);
		}else{
			list = JSONArray.parseObject(resultStr,List.class);
		}
		
		return list;
	}

	@Override
	public List<Map<String, Object>> queryRandom3() {
		Map<String, Object> m = new HashMap<String,Object>();
		m.put("urlFront", Constants.PIC_FRONT_URL);
		return baseDao.queryByMap("TLineDto.queryRandom3", m);
	}
}
