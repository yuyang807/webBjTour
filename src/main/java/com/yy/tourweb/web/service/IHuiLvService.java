package com.yy.tourweb.web.service;

import java.math.BigDecimal;

/**
 * 汇率相关查询
 * @author yy
 *
 */
public interface IHuiLvService {

	BigDecimal getUSDExchangeRate();
}
