package com.example.OnlineShopping.service;


import com.example.OnlineShopping.Repos.CustomerRepository;
import com.example.OnlineShopping.Repos.OrderRepository;
import com.example.OnlineShopping.Repos.ProductRepository;
import com.example.OnlineShopping.dtos.OrderDTO;
import com.example.OnlineShopping.dtos.OrderItemDTO;
import com.example.OnlineShopping.entity.Customer;
import com.example.OnlineShopping.entity.Order;
import com.example.OnlineShopping.entity.OrderItem;
import com.example.OnlineShopping.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository ;

    @Autowired
    private CustomerRepository customerRepository ;

    @Autowired
    private ProductRepository productRepository ;

// CREATE ORDER
    public OrderDTO createOrder (OrderDTO orderDTO )  {
        Order order = new Order();
        Customer customer = customerRepository.findById(orderDTO.getCustomerId()).orElseThrow(() -> new RuntimeException("Customer Not Found !!! "));
        order.setCustomer(customer);

        List<OrderItem> orderItems = new ArrayList<>();
        for (OrderItemDTO itemDTO : orderDTO.getOrderItems())  {

            OrderItem orderItem = new OrderItem();

            Product product = productRepository.findById(itemDTO.getProductId()).orElseThrow(() -> new RuntimeException("Product Not Found !!! "));
            orderItem.setProduct(product);
            orderItem.setOrder(order);
            orderItem.setQuantity(itemDTO.getQuantity());
            orderItem.setPrice(product.getPrice() * itemDTO.getQuantity());
            orderItems.add(orderItem);
        }
        order.setOrderItems(orderItems);
        order = orderRepository.save(order);
        orderDTO.setId(order.getId());
        return orderDTO;
        }

// GET ORDER
    public OrderDTO getOrder(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setCustomerId(order.getCustomer().getId());
        List<OrderItemDTO> orderItemDTOs = new ArrayList<>();
        for (OrderItem orderItem : order.getOrderItems()) {
            OrderItemDTO orderItemDTO = new OrderItemDTO();
            orderItemDTO.setId(orderItem.getId());
            orderItemDTO.setProductId(orderItem.getProduct().getId());
            orderItemDTO.setQuantity(orderItem.getQuantity());
            orderItemDTO.setPrice(orderItem.getPrice());
            orderItemDTOs.add(orderItemDTO);
        }
        orderDTO.setOrderItems(orderItemDTOs);
        return orderDTO;
    }
    }













