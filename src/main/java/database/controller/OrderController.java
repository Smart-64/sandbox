package database.controller;

import database.model.Order;
import database.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Order getOrder(@PathVariable(value = "id") Long id) {
        Order order = service.getOrderById(id);
        return order;
    }
}
