package com.shop.heima.service;


import com.shop.heima.entity.JqItem;

import java.util.List;

public interface JqItemService {
    public JqItem selectItemById(int id);
    public List<JqItem> selectItemAll();
    public void deleteItem(int id);
    public void insertItem(JqItem jqItem);
    public void updateItem(JqItem jqItem);
}
