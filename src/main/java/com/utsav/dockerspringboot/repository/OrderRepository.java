package com.utsav.dockerspringboot.repository;

import com.utsav.dockerspringboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserUserId(Long userId); // Find all orders by user ID
    long countByStatus(String status);

    @Query("SELECT SUM(o.totalAmount) FROM Order o")
    Double calculateTotalRevenue();
}