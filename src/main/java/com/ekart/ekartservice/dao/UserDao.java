package com.ekart.ekartservice.dao;

import com.ekart.ekartservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;

@Repository
public interface UserDao extends JpaRepository<User,Long> {


//   abstract void delete( Long number);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "delete from user where number = :no")
    void delete(@Param("no") Long no);
}
