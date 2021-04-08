package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Counterparty;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/counterparty")
public class CounterpartyController implements Controller<Counterparty> {
    private static final Logger logger = LoggerFactory.getLogger(NomenclatureController.class);
    public static final List<Counterparty> COUNTERPARTY_LIST = new ArrayList<>();

    static {
        COUNTERPARTY_LIST.add(new Counterparty(1, "Пятерочка", "9 мая"));
        COUNTERPARTY_LIST.add(new Counterparty(2, "Батон", "9 мая"));
        COUNTERPARTY_LIST.add(new Counterparty(3, "Магнит", "Бородино"));
        COUNTERPARTY_LIST.add(new Counterparty(4, "Хороший", "9 мая"));
    }

    @Override
    @GetMapping("/{ID}")
    public Counterparty get(@PathVariable(value="ID") long id) {
        for (Counterparty counterparty : COUNTERPARTY_LIST) {
            if (counterparty.getId() == id) return counterparty;
        }
        return null;
    }

    @Override
    @GetMapping
    public List<Counterparty> getAll() {
        return COUNTERPARTY_LIST;
    }

    @Override
    @PostMapping
    public Counterparty add(@RequestBody Counterparty body) {
        logger.info(body.toString());
        var counterparty = new Counterparty(
                COUNTERPARTY_LIST.get(COUNTERPARTY_LIST.size() - 1).getId() + 1,
                body.getTitle(),
                body.getDescription()
        );

        COUNTERPARTY_LIST.add(counterparty);
        logger.info(counterparty.toString());
        return counterparty;
    }
}

