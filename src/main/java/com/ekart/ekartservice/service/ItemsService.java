package com.ekart.ekartservice.service;

import com.ekart.ekartservice.entity.Items;

import java.util.List;

public interface ItemsService {
    Items saveItems(Items items);

    List<Items> findAllItems();

    List<Items> saveAllItems(List<Items> items);

    void deleteItem(String id);
}
