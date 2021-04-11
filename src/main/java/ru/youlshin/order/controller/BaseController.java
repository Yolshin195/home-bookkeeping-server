package ru.youlshin.order.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

public abstract class BaseController<T> {
    private CrudRepository<T, Long> repository;

    public BaseController(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }

    @PostMapping
    public T save(@RequestBody T body) {
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
