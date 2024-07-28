package com.example.OnlineShopping.Repos;


import com.example.OnlineShopping.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem , Long > {

}
