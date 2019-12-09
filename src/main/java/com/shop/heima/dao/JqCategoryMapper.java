package com.shop.heima.dao;

import com.shop.heima.entity.JqCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface JqCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JqCategory record);

    JqCategory selectByPrimaryKey(Integer id);

    List<JqCategory> selectAll();

    int updateByPrimaryKey(int id);
}