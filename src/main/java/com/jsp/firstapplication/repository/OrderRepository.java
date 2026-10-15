
package com.jsp.firstapplication.repository;

import com.jsp.firstapplication.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
