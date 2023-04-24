package com.ekart.ekartservice.dao;

import com.ekart.ekartservice.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao extends JpaRepository<Items,Long> {
}
