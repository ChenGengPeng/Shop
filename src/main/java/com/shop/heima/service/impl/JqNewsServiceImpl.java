package com.shop.heima.service.impl;

import com.shop.heima.dao.JqNewsMapper;
import com.shop.heima.entity.JqNews;
import com.shop.heima.service.JqNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JqNewsServiceImpl implements JqNewsService {
    @Autowired
    private JqNewsMapper jqNewsMapper;
    
    @Override
    public JqNews selectNewsById(int id) {
        return jqNewsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JqNews> selectNewsAll() {
        return jqNewsMapper.selectAll();
    }

    @Override
    public void deleteNews(int id) {
        jqNewsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertNews(JqNews jqNews) {
        jqNewsMapper.insert(jqNews);
    }

    @Override
    public void updateNews(JqNews jqNewsy) {
        jqNewsMapper.updateByPrimaryKey(jqNewsy);
    }
}
