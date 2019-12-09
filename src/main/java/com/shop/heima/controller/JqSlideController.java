package com.shop.heima.controller;

import com.shop.heima.entity.JqSlide;
import com.shop.heima.service.JqSlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("JqSlide")
@RestController
public class JqSlideController {
    @Autowired
    private JqSlideService jqSlideService;

    @GetMapping("insert")
    public void insertJqSlide(JqSlide jqSlide){
        jqSlideService.insertSlide(jqSlide);
    }
    @GetMapping("/delete/{id}")
    public void deleteJqSlide(@PathVariable("id") int id){
        jqSlideService.deleteSlide(id);
    }
    @GetMapping("/update")
    public void updateJqSlide(JqSlide jqSlide){
        jqSlideService.updateSlide(jqSlide);
    }
    @GetMapping("/select/{id}")
    public JqSlide selectJqSlide(@PathVariable("id") int id){
        return jqSlideService.selectSlideById(id);
    }
    @GetMapping("/selectSlideAll")
    public List<JqSlide> selectJqSlideAll(){
      return jqSlideService.selectSlideAll();
    }

}
