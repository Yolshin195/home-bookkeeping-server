package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

public abstract class BaseController<T> {
    private final static Logger logger = LoggerFactory.getLogger(BaseController.class);
    protected CrudRepository<T, Long> repository;

    public BaseController(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }

    @PostMapping
    public T save(@RequestBody T body) {
        logger.info(body.toString());
        return repository.save(body);
    }

    @GetMapping(value = "/{ID}")
    public T findById(@PathVariable(value = "ID") long id) {
        return repository.findById(id).orElseThrow();
    }

    @GetMapping
    public Iterable<T> findAll() {
        return repository.findAll();
    }
}
