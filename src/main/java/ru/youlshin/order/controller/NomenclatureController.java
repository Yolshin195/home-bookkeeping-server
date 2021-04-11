package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Nomenclature;
import ru.youlshin.order.repository.NomenclatureRepository;

@CrossOrigin
@RestController
@RequestMapping("/nomenclature")
public class NomenclatureController extends BaseController<Nomenclature> {
    public NomenclatureController(NomenclatureRepository repository) {
        super(repository);
    }
}
