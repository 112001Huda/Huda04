package com.example.OnlineShopping.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotBlank
    private String name ;

    @NotNull
    private double price ;

    @NotBlank
    private String description ;

// Getter & Setter :


    @OneToMany (mappedBy = "id",cascade = CascadeType.ALL)
    private List<OrderItem> orderItems ;

}
