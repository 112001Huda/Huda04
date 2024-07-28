package com.example.OnlineShopping.Repos;


import com.example.OnlineShopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long > {
}
