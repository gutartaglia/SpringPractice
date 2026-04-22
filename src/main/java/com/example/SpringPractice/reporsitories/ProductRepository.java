package com.example.SpringPractice.reporsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringPractice.entities.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
