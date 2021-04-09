package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Nomenclature;
import ru.youlshin.order.repository.NomenclatureRepository;

@CrossOrigin
@RestController
@RequestMapping("/nomenclature")
public class NomenclatureController {
    private static final Logger logger = LoggerFactory.getLogger(NomenclatureController.class);
    public NomenclatureRepository repository;

    public NomenclatureController(NomenclatureRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Nomenclature save(@RequestBody Nomenclature body) {
        return this.repository.save(body);
    }

    @GetMapping("/{ID}")
    public Nomenclature findById(@PathVariable(value="ID") Long id) {
        return this.repository.findById(id).orElseThrow();
    }

    @GetMapping
    public Iterable<Nomenclature> findAll() {
        return this.repository.findAll();
    }

}
