package com.bazaar.app.DTO.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
    private Integer p_id;
    private String p_name;
    private String p_type;
    private String p_description;
    //    private String p_images;
    private String p_price;

    public Products() {
        super();
    }

    public void setP_id(Integer id) {
        this.p_id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getP_id() {
        return p_id;
    }
    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

}
