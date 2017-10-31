package com.yy.tourweb.web.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Service;

import com.yy.tourweb.web.service.ISeqService;

/**
 * Seq生成Service
 * @author yanghj
 * @version 2016-01-09
 * */
@Service
public class SeqService implements ISeqService{
    
    @Resource(name="iposGenarater")
    private MySQLMaxValueIncrementer iposGenarater;
    
    public String getPosSeq(){
        Long value = iposGenarater.nextLongValue();
        String numStr = String.valueOf(value);
        return numStr;
    }

    public long getOrderSeq(){
        return iposGenarater.nextLongValue();
    }
    
    @Override
    public String getNewOrderNo(String lineNo) {
    	long orderSeq = getOrderSeq();
    	int size = String.valueOf(orderSeq).length();
    	int random = (int)((Math.random()*9+1)*(Math.pow(10, size-3)));
    	random=(random==0?1:random);
        String orderNO = String.format("%1$ty%1$tm%1$td%1$tH%1$tM%1$tS%2$s%3$03d", new Date(), lineNo, Math.round(orderSeq/random));
        return orderNO;
    }
    
    public static void main(String[] args) {
    	long orderSeq = 5622227;
    	int size = String.valueOf(orderSeq).length();
    	int random = (int)((Math.random()*9+1)*(Math.pow(10, size-3)));
    	System.out.println(Math.pow(10, size-3));
    	random=(random==0?1:random);
    	System.out.println(random);
    	System.out.println(5622227/random);
		System.out.println(String.format("%1$ty%1$tm%1$td%1$tH%1$tM%1$tS%2$s%3$03d", new Date(),"1001",Math.round(5622227/random)));
	}
}
