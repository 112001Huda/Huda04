package com.example.OnlineShopping.Repos;


import com.example.OnlineShopping.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order , Long > {

}
