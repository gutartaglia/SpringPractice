package com.example.SpringPractice.reporsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringPractice.entities.OrderItem;
import com.example.SpringPractice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
