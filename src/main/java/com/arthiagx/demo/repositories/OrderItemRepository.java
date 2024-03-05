package com.arthiagx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthiagx.demo.entities.OrderItem;
import com.arthiagx.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
