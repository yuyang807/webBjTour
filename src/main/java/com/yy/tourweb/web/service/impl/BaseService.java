package com.yy.tourweb.web.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yy.tourweb.common.PageEntity;
import com.yy.tourweb.web.dao.IBaseDao;
import com.yy.tourweb.web.dao.PagingResult;
import com.yy.tourweb.web.dto.IDto;
import com.yy.tourweb.web.service.IBaseService;


@Service
public class BaseService implements IBaseService {
    
    @Resource
    private IBaseDao baseDao;
    
    @Override
    public int insert(IDto _dto) {
        return baseDao.insert(_dto);
    }

    @Override
    public int delete(IDto _dto) {
        return baseDao.delete(_dto);
    }
    
    @Override
    public int deleteByPrimaryKey(IDto _dto) {
        return baseDao.deleteByPrimaryKey(_dto);
    }
    
    @Override
    public int update(IDto _dto) {
        return baseDao.update(_dto);
    }

    @Override
    public IDto query(IDto _dto) {
        return baseDao.getByDto(_dto);
    }

    @Override
    public PagingResult<Map<String, Object>> selectPagination(String sqlId, PageEntity<Map<String, Object>> pageEntity) {
        return baseDao.selectPagination(sqlId,pageEntity);
    }

    @Override
    public List<IDto> queryListByDto(IDto _dto) {
        return baseDao.queryListByDto(_dto);
    }

    @Override
    public List<IDto> queryListByMap(String sqlId, Map<String, Object> params) {
        return baseDao.queryListByMap(sqlId, params);
    }

    @Override
    public List<Map<String, Object>> queryByMap(String sqlId, Map<String, Object> params) {
        return baseDao.queryByMap(sqlId, params);
    }

    @Override
    public int updateByMap(String sqlId, Map<String, Object> params) {
        return baseDao.updateByMap(sqlId, params);
    }

    @Override
    public int deleteByMap(String sqlId, Map<String, Object> params) {
        return baseDao.deleteByMap(sqlId, params);
    }

    @Override
    public IDto queryDtoByMap(String sqlId, Map<String, Object> params) {
        return baseDao.queryDtoByMap(sqlId, params);
    }

    @Override
    public PagingResult<IDto> selectPagination(PageEntity<IDto> pageEntity) {
        return baseDao.selectPagination(pageEntity);
    }
}
