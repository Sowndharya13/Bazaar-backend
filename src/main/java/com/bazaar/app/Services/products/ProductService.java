package com.bazaar.app.Services.products;

import com.bazaar.app.DTO.products.Products;
import com.bazaar.app.DTO.stores.Stores;
import com.bazaar.app.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Products> getAllProducts() {
        return repo.findAll();
    }
    public void save(Products products) {
        repo.save(products);
    }
    public Products get(Integer p_id) {
        return repo.findById(p_id).get();
    }
    public List<Products> getProductsByStore(Integer store_id) {
        return repo.getProductsByStore(store_id);
    }
    public void delete(Integer p_id) {
        repo.deleteById(p_id);
    }
}
