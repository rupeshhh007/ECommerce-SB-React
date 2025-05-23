package com.rupesh.e_commerce.Repository;

import com.rupesh.e_commerce.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
