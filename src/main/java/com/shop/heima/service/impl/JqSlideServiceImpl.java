package com.shop.heima.service.impl;

import com.shop.heima.dao.JqSlideMapper;
import com.shop.heima.entity.JqSlide;
import com.shop.heima.service.JqSlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JqSlideServiceImpl implements JqSlideService {
    @Autowired
    private JqSlideMapper jqSlideMapper;
    
    @Override
    public JqSlide selectSlideById(int id) {
        return jqSlideMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<JqSlide> selectSlideAll() {
        return jqSlideMapper.selectAll();
    }

    @Override
    public void deleteSlide(int id) {
        jqSlideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertSlide(JqSlide jqSlide) {
        jqSlideMapper.insert(jqSlide);
    }

    @Override
    public void updateSlide(JqSlide jqSlidey) {
        jqSlideMapper.updateByPrimaryKey(jqSlidey);
    }
}
