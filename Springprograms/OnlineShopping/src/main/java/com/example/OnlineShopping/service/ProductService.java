package com.example.OnlineShopping.service;


import com.example.OnlineShopping.Repos.ProductRepository;
import com.example.OnlineShopping.dtos.ProductDTO;
import com.example.OnlineShopping.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository ;

// CREATE (SAVE) THE DATA

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(product.getPrice());

        product = productRepository.save(product);
        productDTO.setId(product.getId());

        return productDTO ;

    }



// GET PRODUCT BY ID

    public ProductDTO getproduct(Long id){
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found !!!"));

        ProductDTO productDTO = new ProductDTO() ;
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());

        return productDTO ;
    }


}
