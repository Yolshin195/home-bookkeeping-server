package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Counterparty;

public interface CounterpartyRepository extends CrudRepository<Counterparty, Long> {
}
