package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.youlshin.order.entity.Counterparty;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/counterparty")
public class CounterpartyController {
    private static final List<Counterparty> COUNTERPARTY_LIST = new ArrayList<>();

    static {
        COUNTERPARTY_LIST.add(new Counterparty(1, "Пятерочка", "9 мая"));
        COUNTERPARTY_LIST.add(new Counterparty(2, "Батон", "9 мая"));
        COUNTERPARTY_LIST.add(new Counterparty(3, "Магнит", "Бородино"));
        COUNTERPARTY_LIST.add(new Counterparty(4, "Хороший", "9 мая"));
    }

    @GetMapping
    public List<Counterparty> getAll() {
        return COUNTERPARTY_LIST;
    }
}

