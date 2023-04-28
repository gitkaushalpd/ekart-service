package com.ekart.ekartservice.service;

import com.ekart.ekartservice.dao.ItemsDao;
import com.ekart.ekartservice.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    ItemsDao itemsDao;

    @Override
    public Items saveItems(Items items) {
        return itemsDao.save(items);
    }

    @Override
    public List<Items> findAllItems() {
        return (List<Items>)  itemsDao.findAll();
    }

    @Override
    public List<Items> saveAllItems(List<Items> items) {
        return itemsDao.saveAll(items);
    }

    @Override
    public void deleteItem(String id) {
        itemsDao.deleteItem(id);
    }




}
