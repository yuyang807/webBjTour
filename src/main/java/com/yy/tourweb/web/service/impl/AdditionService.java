package com.yy.tourweb.web.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.yy.tourweb.common.Constants;
import com.yy.tourweb.util.StringUtils;
import com.yy.tourweb.web.dao.IBaseDao;
import com.yy.tourweb.web.redis.RedisClientTemplate;
import com.yy.tourweb.web.service.IAdditionService;

/**
 * 附加项service
 * @author yy
 *
 */
@Service
public class AdditionService implements IAdditionService{

	@Resource
	private RedisClientTemplate redisClient;

	@Resource
	private IBaseDao baseDao;
	
	@Override
	public List<Map<String, Object>> queryLineAddition(String lineNo, int isAdd) {
		Map<String, Object> params = new HashMap<String, Object>();
		String resultStr = "";
		List list = null;
		String key = "";
		
		if(isAdd == 0){//查询包含附加项
			key = Constants.REDIS_LINE_ADD+lineNo;
		}else{
			key = Constants.REDIS_LINE_UN_ADD+lineNo;
			params.put("notMark", 1);
		}
		resultStr = redisClient.get(key);
		
		if(StringUtils.isBlank(resultStr)){
			params.put("lineNo", lineNo);
			list = baseDao.queryByMap("TAdditionDto.queryLineAddition", params);
			String jsonStr = JSONArray.toJSONString(list);
			redisClient.set(key, jsonStr);
		}else{
			list = JSONArray.parseArray(resultStr,List.class);
		}
		
        return list;
	}

}
