package com.bazaar.app.Repository;

import com.bazaar.app.DTO.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
