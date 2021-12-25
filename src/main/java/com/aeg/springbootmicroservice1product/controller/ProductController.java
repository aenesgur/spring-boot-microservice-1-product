package com.aeg.springbootmicroservice1product.controller;

import com.aeg.springbootmicroservice1product.model.Product;
import com.aeg.springbootmicroservice1product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {


    private final IProductService productService;
    public ProductController(IProductService productService){
        this.productService = productService;
    }


    @PostMapping
    public ResponseEntity saveProduct(@RequestBody Product product){
        return new ResponseEntity(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllProductS(){
        return new ResponseEntity(productService.findallProducts(), HttpStatus.CREATED);
    }
}