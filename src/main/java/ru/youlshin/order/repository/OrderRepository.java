package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
