package com.aeg.springbootmicroservice1product.service;

import com.aeg.springbootmicroservice1product.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findallProducts();
}
