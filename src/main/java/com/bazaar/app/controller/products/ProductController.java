package com.bazaar.app.controller.products;

import com.bazaar.app.DTO.products.Products;
import com.bazaar.app.Services.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/product")
    public List<Products> list() {
        System.out.println(service.getAllProducts());

        return service.getAllProducts();

    }

    @GetMapping("/product/{p_id}")
    public ResponseEntity<Products> get(@PathVariable Integer p_id) {
        try {
            Products products = service.get(p_id);
            return new ResponseEntity<Products>(products, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
        }

    }
//    @PostMapping("/user")
//    public void add(@RequestBody Users user) {
//        service.save(user);
//    }
}
