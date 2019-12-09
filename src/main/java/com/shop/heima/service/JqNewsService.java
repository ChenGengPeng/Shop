package com.shop.heima.service;


import com.shop.heima.entity.JqNews;
import com.shop.heima.entity.JqNews;

import java.util.List;

public interface JqNewsService {
    public JqNews selectNewsById(int id);
    public List<JqNews> selectNewsAll();
    public void deleteNews(int id);
    public void insertNews(JqNews jqNews);
    public void updateNews(JqNews jqNews);
}
