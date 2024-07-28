package com.example.OnlineShopping.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "\"order\"")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer ;

    @OneToMany (mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderItem> orderItems ;
}
