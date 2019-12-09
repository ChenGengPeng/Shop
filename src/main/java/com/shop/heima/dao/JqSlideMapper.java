package com.shop.heima.dao;

import com.shop.heima.entity.JqSlide;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface JqSlideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JqSlide record);

    JqSlide selectByPrimaryKey(Integer id);

    List<JqSlide> selectAll();

    int updateByPrimaryKey(JqSlide record);
}