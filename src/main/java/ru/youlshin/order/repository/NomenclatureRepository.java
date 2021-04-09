package ru.youlshin.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.youlshin.order.entity.Nomenclature;

public interface NomenclatureRepository extends CrudRepository<Nomenclature, Long> {
}
