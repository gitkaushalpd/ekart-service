package com.ekart.ekartservice.dao;

import com.ekart.ekartservice.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;

@Repository
public interface ItemsDao extends JpaRepository<Items,Long> {


    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "delete from items where id = :id")
    void deleteItem(@Param("id") String id);
}
