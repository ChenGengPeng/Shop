package com.shop.heima.service.impl;

import com.shop.heima.dao.JqCategoryMapper;
import com.shop.heima.dao.JqItemMapper;
import com.shop.heima.entity.JqCategory;
import com.shop.heima.entity.JqItem;
import com.shop.heima.service.JqItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JqItemServiceImpl implements JqItemService {
    @Autowired
    private JqItemMapper jqItemMapper;

    @Override
    public JqItem selectItemById(int id) {
        return jqItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JqItem> selectItemAll() {
        return jqItemMapper.selectAll();
    }

    @Override
    public void deleteItem(int id) {
        jqItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertItem(JqItem jqItem) {
        jqItemMapper.insert(jqItem);
    }

    @Override
    public void updateItem(JqItem jqItemy) {
        jqItemMapper.update(jqItemy);
    }
}
