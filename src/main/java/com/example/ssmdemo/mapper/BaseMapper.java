package com.example.ssmdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author jiangjianhui
 * @create 2018-01-16 10:26
 **/
@Repository
@Mapper
public interface BaseMapper {
    /**
     * 保存一个实体
     * @param entity
     */
    public <T> void save(T entity);
    /**
     * 修改一个实体
     * @param entity
     */
    public <T> void update(T entity);
    /**
     * 删除一个实体
     * @param id 主键
     */
    public void delete(Serializable id);

    /**
     * 获取一个实体
     * @param id 主键
     * @return 实体
     */
    public <T> T get(Serializable id);
    /**
     * 查询所有实体
     * @param params 查询参数
     * @return 集合
     */
    public <T> List<T> find(Map<String, Object> params);
    /**
     * 统计查询
     * @param params 查询参数
     * @return 总记录条数
     */
    public int count(Map<String, Object> params);
    /**
     * 分页查询
     * @param params 查询参数
     * @return 实体集合
     */
    public <T> List<T> findByPage(Map<String, Object> params);
}
