package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Order;
import ru.youlshin.order.entity.Price;
import ru.youlshin.order.entity.Product;
import ru.youlshin.order.repository.OrderRepository;
import ru.youlshin.order.repository.PriceRepository;
import ru.youlshin.order.repository.ProductRepository;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<Order> {
    private ProductRepository productRepository;
    private PriceRepository priceRepository;

    public OrderController(OrderRepository repository, ProductRepository productRepository, PriceRepository priceRepository) {
        super(repository);
        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }

    @Override
    @PostMapping
    public Order save(@RequestBody Order body) {
        body.getProductList().forEach(product -> {
             Price price = priceRepository.findFirstByNomenclatureIdAndCounterpartyIdOrderByCreateDesc(
                    product.getNomenclature().getId(), body.getCounterparty().getId());
            if (price == null || product.getPrice().equals(price.getPrice())) {
                priceRepository.save(new Price()
                        .price(product.getPrice())
                        .counterparty(body.getCounterparty())
                        .nomenclature(product.getNomenclature())
                        .create(new Date()));
            }
        });
        Order order = super.save(body);
        order.getProductList().forEach(product -> product.setOrder(order));
        order.setProductList((List<Product>) productRepository.saveAll(body.getProductList()));

        return order;
    }
}
