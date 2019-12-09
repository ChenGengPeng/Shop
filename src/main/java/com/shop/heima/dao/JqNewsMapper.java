package com.shop.heima.dao;

import com.shop.heima.entity.JqNews;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface JqNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JqNews record);

    JqNews selectByPrimaryKey(Integer id);

    List<JqNews> selectAll();

    int updateByPrimaryKey(JqNews record);
}