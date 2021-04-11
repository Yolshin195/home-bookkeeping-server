package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
