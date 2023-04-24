package com.ekart.ekartservice.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    // define properties ...

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @Id
    @Column(name = "number")
    private  Long number;

    // define constructor...

    public User( String name, String email, Long number) {

        this.name = name;
        this.email = email;
        this.number = number;
    }

    // define getter() and setter()


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    // define toString() method...


    @Override
    public String toString() {
        return "User{" +

                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}

