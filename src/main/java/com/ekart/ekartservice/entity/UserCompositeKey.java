package com.ekart.ekartservice.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

public class UserCompositeKey implements Serializable {
    private Long uid;
    private Long number;

    public UserCompositeKey() {
    }

    public UserCompositeKey(Long id, Long number) {
        this.uid = id;
        this.number = number;
    }

    public Long getId() {
        return uid;
    }

    public void setId(Long id) {
        this.uid = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
