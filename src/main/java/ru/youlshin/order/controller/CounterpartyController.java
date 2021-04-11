package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Counterparty;
import ru.youlshin.order.repository.CounterpartyRepository;

@CrossOrigin
@RestController
@RequestMapping("/counterparty")
public class CounterpartyController extends BaseController<Counterparty> {
    public CounterpartyController(CounterpartyRepository repository) {
        super(repository);
    }
}

