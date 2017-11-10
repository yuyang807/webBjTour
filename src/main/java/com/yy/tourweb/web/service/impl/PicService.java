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
import com.yy.tourweb.web.dto.TPicDto;
import com.yy.tourweb.web.redis.RedisClientTemplate;
import com.yy.tourweb.web.service.IPicService;

/**
 * 图片service
 * @author yy
 *
 */
@Service
public class PicService implements IPicService{

	@Resource
	private RedisClientTemplate redisClient;

	@Resource
	private IBaseDao baseDao;
	
	/**
	 * 获取主页轮播图片路径
	 * @return List<TPicDto>
	 */
	@Override
	public List<TPicDto> queryMainPicList(){
		Map<String, Object> params = new HashMap<String, Object>();
		String resultStr = "";
		List list = null;
		
		resultStr = redisClient.get(Constants.REDIS_PIC_MAIN);
		if(StringUtils.isBlank(resultStr)){
			params.put("isMainAll", 1);
			params.put("urlFront", Constants.PIC_FRONT_URL+"main/");
			list = baseDao.queryListByMap("TPicDto.queryWebPic", params);
			String jsonStr = JSONArray.toJSONString(list);
			redisClient.set(Constants.REDIS_PIC_MAIN,3600*3, jsonStr);
		}else{
			list = JSONArray.parseObject(resultStr,List.class);
		}
		
        return list;
	}
}
