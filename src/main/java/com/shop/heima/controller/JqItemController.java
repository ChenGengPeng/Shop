package com.shop.heima.controller;

import com.shop.heima.entity.JqItem;
import com.shop.heima.service.JqItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("JqItem")
@RestController
public class JqItemController {
    @Autowired
    private JqItemService jqItemService;

    @GetMapping("insert")
    public void insertJqItem(JqItem jqItem){
        jqItemService.insertItem(jqItem);
    }
    @GetMapping("/delete/{id}")
    public void deleteJqItem(@PathVariable("id") int id){
        jqItemService.deleteItem(id);
    }
    @GetMapping("/update")
    public void updateJqItem(JqItem jqItem){
        jqItemService.updateItem(jqItem);
    }
    @GetMapping("/select/{id}")
    public JqItem selectJqItem(@PathVariable("id") int id){
        return jqItemService.selectItemById(id);
    }
    @GetMapping("/selectAll")
    public List<JqItem> selectJqItemAll(){
      return jqItemService.selectItemAll();
    }

}
