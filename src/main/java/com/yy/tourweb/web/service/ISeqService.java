package com.yy.tourweb.web.service;
/**
 * Seq生成IService
 * @author yy
 * @version 2017-10-09
 * */
public interface ISeqService {
    
    /**
     * 生成序列号
     * */
    public long getOrderSeq();
    
    /**
     * 生成订单流水号 
     * 订单流水号是递增的 用其除以一个小于其位数2位的随机数 作为订单号的后三位
     * 
     * */
    public String getNewOrderNo(String lineNo);
}
