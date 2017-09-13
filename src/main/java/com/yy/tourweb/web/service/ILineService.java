package com.yy.tourweb.web.service;

import java.util.List;
import java.util.Map;

public interface ILineService {

	/**
	 * 查询线路列表
	 * @param isMain 是否为首页查询
	 * @return
	 */
	public List<Map<String,Object>> queryLineList(int isMain);
	
	/**
	 * 查询线路详情
	 * @param lineNo
	 * @return
	 */
	public List<Map<String,Object>> queryOneLine(String lineNo);
	
	/**
	 * 随机获取3条路线
	 * @param lineNo
	 * @return
	 */
	public List<Map<String,Object>> queryRandom3();
}
