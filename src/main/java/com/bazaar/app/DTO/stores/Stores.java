package com.bazaar.app.DTO.stores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

@Entity
public class Stores {
    private Integer store_id;
    private String store_name;
    private String store_type;
    private String store_category;
    private String store_description;

//    private Image brand_logo;
    private String store_location;
    private String store_phone ;
    private Integer user_id;

    public Stores() {
        super();
    }

    public void setStore_id(Integer id) {
        this.store_id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getStore_id() {
        return store_id;
    }
    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_type() {
        return store_type;
    }

    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }


    public String getStore_category() {
        return store_category;
    }

    public void setStore_category(String store_category) {
        this.store_category = store_category;
    }

    public String getStore_description() {
        return store_description;
    }

    public void setStore_description(String store_description) {
        this.store_description = store_description;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String getStore_phone() {
        return store_phone;
    }

    public void setStore_phone(String store_phone) {
        this.store_phone = store_phone;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


}
