package com.gvfs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.course.entities.OrderItem;
import com.gvfs.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
