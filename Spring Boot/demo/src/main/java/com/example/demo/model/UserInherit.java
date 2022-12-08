package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserInherit extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}