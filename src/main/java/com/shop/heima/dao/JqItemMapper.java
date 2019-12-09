package com.shop.heima.dao;

import com.shop.heima.entity.JqItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface JqItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JqItem record);

    JqItem selectByPrimaryKey(Integer id);

    List<JqItem> selectAll();

    int update(JqItem record);
}