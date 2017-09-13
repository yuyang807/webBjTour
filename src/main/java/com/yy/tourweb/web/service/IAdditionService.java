package com.yy.tourweb.web.service;

import java.util.List;
import java.util.Map;

/**
 * 附加项Service
 * @author yy
 *
 */
public interface IAdditionService {

	/**
	 * 查询线路对应附加项 或不含的附加项
	 * @param isAdd ： 0为查询附加项；1为查询不含附加项
	 * @return
	 */
	public List<Map<String, Object>> queryLineAddition(String lineNo, int isAdd);
}
