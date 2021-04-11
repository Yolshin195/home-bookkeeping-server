package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Order;
import ru.youlshin.order.entity.Product;
import ru.youlshin.order.repository.OrderRepository;
import ru.youlshin.order.repository.ProductRepository;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<Order> {
    private ProductRepository productRepository;

    public OrderController(OrderRepository repository, ProductRepository productRepository) {
        super(repository);
        this.productRepository = productRepository;
    }

    @Override
    @PostMapping
    public Order save(@RequestBody Order body) {
        Order order = super.save(body);
        order.getProductList().forEach(product -> product.setOrder(order));
        order.setProductList((List<Product>) productRepository.saveAll(body.getProductList()));

        return order;
    }
}
