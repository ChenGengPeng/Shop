package com.shop.heima.service.impl;

import com.shop.heima.dao.JqCategoryMapper;
import com.shop.heima.entity.JqCategory;
import com.shop.heima.service.JqCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JqCategoryServiceimpl implements JqCategoryService {
    @Autowired
    private JqCategoryMapper jqCategoryMapper;

    @Override
    public JqCategory selectJqCategoryById(int id) {
        return jqCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JqCategory> selectJqCategoryAll() {
        return jqCategoryMapper.selectAll();
    }

    @Override
    public void deleteJqCategory(int id) {
        jqCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertJqCategory(JqCategory jqCategory) {
        jqCategoryMapper.insert(jqCategory);
    }

    @Override
    public int updateJqCategory(int id ) {
    return jqCategoryMapper.updateByPrimaryKey(id);
    }
}
