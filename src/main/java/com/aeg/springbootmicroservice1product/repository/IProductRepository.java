package com.aeg.springbootmicroservice1product.repository;

import com.aeg.springbootmicroservice1product.model.Product;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
