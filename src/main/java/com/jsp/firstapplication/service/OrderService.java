package com.jsp.firstapplication.service;

import com.jsp.firstapplication.entity.Order;
import java.util.List;

public interface OrderService {

    Order saveOrder(Order order);

    Order findOrderById(Integer id);

    List<Order> findAllOrders();

    Order updateOrder(Integer id, Order order);

    void deleteOrder(Integer id);
}