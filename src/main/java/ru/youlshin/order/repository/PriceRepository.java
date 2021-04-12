package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {
    Price findFirstByNomenclatureIdAndCounterpartyIdOrderByCreateDesc(long NomenclatureId, long CounterpartyId);
}
