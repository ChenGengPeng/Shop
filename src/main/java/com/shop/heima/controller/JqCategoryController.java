package com.shop.heima.controller;

import com.shop.heima.entity.JqCategory;
import com.shop.heima.service.JqCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("JqCategory")
@RestController
public class JqCategoryController {
    @Autowired
    private JqCategoryService jqCategoryService;

    @GetMapping("insert")
    public void insertJqCategory(JqCategory jqCategory){
        jqCategoryService.insertJqCategory(jqCategory);
    }
    @GetMapping("/delete/{id}")
    public void deleteJqCategory(@PathVariable("id") int id){
        jqCategoryService.deleteJqCategory(id);
    }
    @GetMapping("/update/{id}")
    public void updateJqCategory(@PathVariable("id") int id){
        jqCategoryService.updateJqCategory(id);
    }
    @GetMapping("/select/{id}")
    public JqCategory selectJqCategory(@PathVariable("id") int id){
        return jqCategoryService.selectJqCategoryById(id);
    }
    @GetMapping("/selectCategoryAll")
    public List<JqCategory> selectJqCategoryAll(){
      return jqCategoryService.selectJqCategoryAll();
    }

}
