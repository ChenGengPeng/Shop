package com.shop.heima.service;


import com.shop.heima.entity.JqSlide;

import java.util.List;

public interface JqSlideService {
    public JqSlide selectSlideById(int id);
    public List<JqSlide> selectSlideAll();
    public void deleteSlide(int id);
    public void insertSlide(JqSlide jqSlide);
    public void updateSlide(JqSlide jqSlide);
}
