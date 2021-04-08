package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Order;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController implements Controller<Order> {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    private static final List<Order> ORDER_LIST = new ArrayList<>();

    @Override
    @PostMapping
    public Order add(@RequestBody Order body) {
        logger.info(body.toString());
        if (ORDER_LIST.size() > 0) {
            body.setId(ORDER_LIST.get(ORDER_LIST.size() - 1).getId() + 1);
        } else {
            body.setId(1);
        }
        ORDER_LIST.add(body);
        logger.info(body.toString());
        return body;
    }

    @Override
    @GetMapping("/{ID}")
    public Order get(long id) {
        for (var order : ORDER_LIST) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    @GetMapping
    public List<Order> getAll() {
        return ORDER_LIST;
    }
}
