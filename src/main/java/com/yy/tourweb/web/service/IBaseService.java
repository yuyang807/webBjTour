package com.yy.tourweb.web.service;

import java.util.List;
import java.util.Map;

import com.yy.tourweb.common.PageEntity;
import com.yy.tourweb.web.dao.PagingResult;
import com.yy.tourweb.web.dto.IDto;


public interface IBaseService {
    /**
     * 新增一条记录
     * */
    int insert(IDto _dto);
    /**
     * 根据Dto删除一条记录
     * 
     * @return
     */
    int delete(IDto _dto);
    /**
     * 根据主键删除一条记录
     * 
     * @return
     */
    int deleteByPrimaryKey(IDto _dto);
    /**
     * 根据主键更新一条记录
     * 
     * @return
     */
    int update(IDto _dto);
    /**
     * 通过Dto查询一条记录
     * 
     * @return
     */
    IDto query(IDto _dto);
    /**
     * 按条件查询记录，并处理成分页结果
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return PaginationResult对象，包括（符合条件的）总记录数、页实体对象List等
     */
    PagingResult<Map<String, Object>> selectPagination(String sqlId, PageEntity<Map<String, Object>> pageEntity);
    
    /**
     * 按条件查询记录，并处理成分页结果
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return PaginationResult对象，包括（符合条件的）总记录数、页实体对象List等
     */
    PagingResult<IDto> selectPagination(PageEntity<IDto> pageEntity);
    /**
     * 通过Dto查询符合条件的记录
     * 
     * @return
     */
    List<IDto> queryListByDto(IDto _dto);
    /**
     * 
     * @brief
     *     自定查询单表多条记录方法
     * @author
     *    - 2016年12月15日  阳虎君  创建初始版本
     *
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param params 输入参数
     * @return
     */
    public List<IDto> queryListByMap(String sqlId, Map<String, Object> params);
    
    /**
     * @brief
     *    自定查询多条记录方法,支持联表查询
     * @author
     *    - 2016年12月15日  阳虎君  创建初始版本
     *
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param params 输入参数
     * @return
     */
    public List<Map<String, Object>> queryByMap(String sqlId, Map<String, Object> params);
    
    /**
     * 
     * @brief 
     *      自定义更新方法
     * @author
     *    - 2016年12月15日  阳虎君  创建初始版本
     *
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param params 输入参数
     * @return
     */
    public int updateByMap(String sqlId, Map<String, Object> params);
    /**
     * 
     * @brief 
     *      自定义删除方法
     * @author
     *    - 2016年12月15日  阳虎君  创建初始版本
     *
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param params 输入参数
     * @return
     */
    public int deleteByMap(String sqlId, Map<String, Object> params);
    /**
     * 
     * @brief 
     *      自定义查询一条记录方法
     * @author
     *    - 2016年12月15日  阳虎君  创建初始版本
     *
     * @param sqlId 【Dto名称.SQL语句的ID】
     * @param params 输入参数
     * @return
     */
    public IDto queryDtoByMap(String sqlId, Map<String, Object> params);
}
