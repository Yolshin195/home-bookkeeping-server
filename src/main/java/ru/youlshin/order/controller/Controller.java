package ru.youlshin.order.controller;

import java.util.List;

public interface Controller<T> {
    T add(T body);
    T get(long id);
    List<T> getAll();
}
