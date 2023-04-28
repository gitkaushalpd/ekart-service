package com.ekart.ekartservice.controller;

import com.ekart.ekartservice.entity.Items;
import com.ekart.ekartservice.entity.User;
import com.ekart.ekartservice.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class ItemsController {
    @Autowired ItemsService itemsService;

    // define method to save item in database

    @PostMapping(value ="/saveItems")
    Items saveItems(@RequestBody Items items){
        return itemsService.saveItems(items);
    }

    // define a method to find all list of items

   @GetMapping(value = "/findAllItems")
     List<Items> findAllItems(){

   List<Items> itemsList= new ArrayList<>();

     itemsList= itemsService.findAllItems();
         return itemsList;
     }

    @PostMapping(value = "/saveAllItems")
    List<Items> saveAllItems(@RequestBody List<Items> items){
        return  itemsService.saveAllItems(items);
    }

    @DeleteMapping(value="/deleteItem")
    void deleteItem(@RequestBody String id){
        System.out.println(id);
        itemsService.deleteItem(id);
    }

}
