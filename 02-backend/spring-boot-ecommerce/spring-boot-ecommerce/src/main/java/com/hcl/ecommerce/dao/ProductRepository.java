package com.hcl.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
