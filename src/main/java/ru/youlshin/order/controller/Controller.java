package ru.youlshin.order.controller;

import java.util.List;

public interface Controller<T> {
    T save(T body);
    T findById(long id);
    Iterable<T> findAll();
}
