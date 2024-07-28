package com.example.OnlineShopping.dtos;



import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

    private Long id ;
    private Long customerId ;
    private List<OrderItemDTO> orderItems ;

// Getter & Setter


}
