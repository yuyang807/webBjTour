package com.yy.tourweb.web.dao.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springmore.core.datasource.DynamicSqlSessionTemplate;

import com.yy.tourweb.common.PageEntity;
import com.yy.tourweb.web.dao.IBaseDao;
import com.yy.tourweb.web.dao.PagingResult;
import com.yy.tourweb.web.dto.IDto;


@Repository
public class BaseDao implements IBaseDao{
    
//    private static final AppLogger LOGGER = new AppLogger(BaseDao.class);
    /**
     * 设置别名,可以使用命名空间短名称
     * */
    private static final String typeAliases="com.yy.tourweb.web.dto";
    
    //默认一次只能查询100条
    private static final RowBounds defaultRowBounds = new RowBounds(0, 100);
    
    @Resource
    protected DynamicSqlSessionTemplate dynamicSqlSessionTemplate;

    public String getNameSpace(IDto _dto) {
        return _dto.getClass().getName();
    }

    @Override
    public int save(IDto _dto) {
        return  insert(_dto);
    }

    @Override
    public int insert(IDto _dto) {
        return dynamicSqlSessionTemplate.insert(getNameSpace(_dto)+".insert", _dto);
    }

    @Override
    public int add(IDto _dto) {
        return  insert(_dto);
    }

    @Override
    public int deleteByPrimaryKey(IDto _dto) {
        return dynamicSqlSessionTemplate.delete(getNameSpace(_dto)+".deleteByPrimaryKey", _dto);
    }

    @Override
    public int delete(IDto _dto) {
        return dynamicSqlSessionTemplate.delete(getNameSpace(_dto)+".delete", _dto);
    }

    @Override
    public IDto queryByDto(IDto _dto) {
        return dynamicSqlSessionTemplate.selectOne(getNameSpace(_dto)+".query", _dto);
    }

    @Override
    public IDto getByDto(IDto _dto) {
        return queryByDto(_dto);
    }

    @Override
    public List<IDto> getListByDto(IDto _dto) {
    	return dynamicSqlSessionTemplate.selectList(getNameSpace(_dto)+".query", _dto , defaultRowBounds);
    }
    
    @Override
	public List<IDto> queryListByDto(IDto _dto) {
		return getListByDto(_dto);
	}
    
    @Override
    public int update(IDto _dto) {
        return dynamicSqlSessionTemplate.update(getNameSpace(_dto)+".update", _dto);
    }

    public long getCount(String sqlId, Map<String, Object> param) {
        return dynamicSqlSessionTemplate.selectOne(typeAliases+"."+sqlId, param);
    }
    
    public long getCount(IDto param) {
        return dynamicSqlSessionTemplate.selectOne(getNameSpace(param)+".count",param);
    }

    @Override
    public List<IDto> queryListByMap(String sqlId, Map<String, Object> params) {
        sqlId=typeAliases+"."+sqlId;
        return dynamicSqlSessionTemplate.selectList(sqlId, params, defaultRowBounds);
    }

    @Override
    public List<Map<String, Object>> queryByMap(String sqlId, Map<String, Object> params) {
        sqlId=typeAliases+"."+sqlId;
        return dynamicSqlSessionTemplate.selectList(sqlId, params, defaultRowBounds);
    }

    @Override
    public int updateByMap(String sqlId, Map<String, Object> params) {
        sqlId=typeAliases+"."+sqlId;
        return dynamicSqlSessionTemplate.update(sqlId,params);
    }

    @Override
    public int deleteByMap(String sqlId, Map<String, Object> params) {
        sqlId=typeAliases+"."+sqlId;
        return dynamicSqlSessionTemplate.delete(sqlId,params);
    }

    @Override
    public IDto queryDtoByMap(String sqlId, Map<String, Object> params) {
        sqlId=typeAliases+"."+sqlId;
        return dynamicSqlSessionTemplate.selectOne(sqlId,params);
    }

    @Override
    public PagingResult<Map<String, Object>> selectPagination(String sqlId,
            PageEntity<Map<String, Object>> pageEntity) {
        try {
            int page =
                    pageEntity.getPage() == null || 0 == pageEntity.getPage()
                            ? 1
                            : pageEntity.getPage(); // 默认为第一页
            int size =
                    pageEntity.getSize() == null || 0 == pageEntity.getSize()
                            ? 15
                            : pageEntity.getSize();// 默认每页15个
            RowBounds rowBounds = new RowBounds((page - 1) * size, size);
            Map<String, Object> param = pageEntity.getParam();
            sqlId=typeAliases+"."+sqlId;
            List<Map<String, Object>> resultList=dynamicSqlSessionTemplate.selectList(typeAliases+"."+sqlId, param, rowBounds);
            long totalSize = getCount(sqlId+"Count", param);
            PagingResult<Map<String, Object>> pagingResult = new PagingResult<Map<String, Object>>();
            pagingResult.setCurrentPage(page);
            pagingResult.setTotalSize(totalSize);
            pagingResult.setResultList(resultList);
            pagingResult.setPageSize(size);
            return pagingResult;
        } catch (Exception e) {
//            LOGGER.error("BaseDao selectPagination error", e);
            return null;
        }
    }

    @Override
    public PagingResult<IDto> selectPagination(PageEntity<IDto> pageEntity) {
        try {
            int page =
                    pageEntity.getPage() == null || 0 == pageEntity.getPage()
                            ? 1
                            : pageEntity.getPage(); // 默认为第一页
            int size =
                    pageEntity.getSize() == null || 0 == pageEntity.getSize()
                            ? 15
                            : pageEntity.getSize();// 默认每页15个
            RowBounds rowBounds = new RowBounds((page - 1) * size, size);
            IDto param = pageEntity.getParam();
            List<IDto> resultList=dynamicSqlSessionTemplate.selectList(getNameSpace(param)+".query", param, rowBounds);
            long totalSize = getCount(param);
            PagingResult<IDto> pagingResult = new PagingResult<IDto>();
            pagingResult.setCurrentPage(page);
            pagingResult.setTotalSize(totalSize);
            pagingResult.setResultList(resultList);
            pagingResult.setPageSize(size);
            return pagingResult;
        } catch (Exception e) {
//            LOGGER.error("BaseDao selectPagination error", e);
            return null;
        }
    }

	/* (non-Javadoc)
	 * @see com.yy.tourweb.web.dao.IBaseDao#update(com.yy.tourweb.web.dto.IDto, java.lang.String)
	 */
	@Override
	public int update(IDto _dto, String sqlId) {
		return dynamicSqlSessionTemplate.update(getNameSpace(_dto)+"."+sqlId, _dto);
	}
}