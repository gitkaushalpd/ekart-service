package com.ekart.ekartservice.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@NoArgsConstructor
@Entity
@Table(name="items")
public class Items {
// define properties...


    @Column(name = "iname")
    private String name;

    @Id
    @Column(name="id")
    private String id;

    @Column(name = "price")
    private BigDecimal price  ;

    // define constructor ...
    public Items(String name,String id,BigDecimal price){
        this.name=name;
        this.id= id;
        this.price=price;

    }

// define getter and setter...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    // define toString() method...


    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
