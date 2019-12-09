package com.shop.heima.service;

import com.shop.heima.entity.JqCategory;

import java.util.List;

public interface JqCategoryService {
    public JqCategory selectJqCategoryById(int id);
    public List<JqCategory> selectJqCategoryAll();
    public void deleteJqCategory(int id);
    public void insertJqCategory(JqCategory jqCategory);
    public int updateJqCategory(int id);

}
