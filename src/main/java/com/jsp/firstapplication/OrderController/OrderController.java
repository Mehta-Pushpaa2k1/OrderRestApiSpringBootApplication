package com.jsp.firstapplication.OrderController;

import java.util.List;

import com.jsp.firstapplication.entity.Order;
import com.jsp.firstapplication.service.OrderService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderss")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Create Order
    @PostMapping("/created")
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    // Find Order By ID
    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable Integer id) {
        return orderService.findOrderById(id);
    }
    //http://localhost:8080/orderss/1

    // Find All Orders
    @GetMapping
    public List<Order> findAllOrders() {
        return orderService.findAllOrders();
    }
    //http://localhost:8080/orderss

    // Update Order
    @PutMapping("/{id}")
    public Order updateOrder(
            @PathVariable Integer id,
            @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }
    // http://localhost:8080/orders/1

    // Delete Order
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);
        return "Order is deleted successfully";
    }
}