package com.aeg.springbootmicroservice1product.service;

import com.aeg.springbootmicroservice1product.model.Product;
import com.aeg.springbootmicroservice1product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private final IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findallProducts(){
        return productRepository.findAll();
    }
}
