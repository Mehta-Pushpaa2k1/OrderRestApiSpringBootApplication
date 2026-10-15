package com.jsp.firstapplication.service.ServiceImpl;

import com.jsp.firstapplication.entity.Order;
import com.jsp.firstapplication.repository.OrderRepository;
import com.jsp.firstapplication.service.OrderService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findOrderById(Integer id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found: " + id));
    }

    @Override
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Integer id, Order order) {
        Order existing = findOrderById(id);

        existing.setCustomerName(order.getCustomerName());
        existing.setProductName(order.getProductName());
        existing.setPrice(order.getPrice());
        existing.setQuantity(order.getQuantity());

        return orderRepository.save(existing);
    }

    @Override
    public void deleteOrder(Integer id) {
        Order existing = findOrderById(id);
        orderRepository.delete(existing);
    }
}