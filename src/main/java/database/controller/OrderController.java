package database.controller;

import database.model.Order;
import database.service.OrderService;
import exception.InvalidOrderException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
        Order order = null;
        try {
            order = service.getOrderById(id);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        }
        return order;
    }


    @PostMapping("")
    public String getOrder(@RequestParam(required = false) Map<String, String> map) {
        System.out.println(map);
        return "Params: " + map.entrySet();
    }
}
