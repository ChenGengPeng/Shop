package com.shop.heima.controller;

import com.shop.heima.entity.JqNews;
import com.shop.heima.service.JqNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("JqNews")
@RestController
public class JqNewsController {
    @Autowired
    private JqNewsService jqNewsService;

    @GetMapping("insert")
    public void insertJqNews(JqNews jqNews){
        jqNewsService.insertNews(jqNews);
    }
    @GetMapping("/delete/{id}")
    public void deleteJqNews(@PathVariable("id") int id){
        jqNewsService.deleteNews(id);
    }
    @GetMapping("/update")
    public void updateJqNews(JqNews jqNews){
        jqNewsService.updateNews(jqNews);
    }
    @GetMapping("/select/{id}")
    public JqNews selectJqNews(@PathVariable("id") int id){
        return jqNewsService.selectNewsById(id);
    }
    @GetMapping("/selectAll")
    public List<JqNews> selectJqNewsAll(){
      return jqNewsService.selectNewsAll();
    }

}
