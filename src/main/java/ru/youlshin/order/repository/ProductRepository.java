package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
