package com.ekart.ekartservice.dao;

import com.ekart.ekartservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
}
