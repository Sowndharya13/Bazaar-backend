package com.bazaar.app.Repository;

import com.bazaar.app.DTO.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    @Query(value = "SELECT p from Products p where p.store_id = :store_id")
    List<Products> getProductsByStore(Integer store_id);
}
