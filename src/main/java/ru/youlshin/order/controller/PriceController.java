package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Counterparty;
import ru.youlshin.order.entity.Nomenclature;
import ru.youlshin.order.entity.Price;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/price")
public class PriceController implements Controller<Price> {
    private static final Logger logger = LoggerFactory.getLogger(PriceController.class);
    private static final List<Price> LIST = new ArrayList<>();
    static {
        LIST.add(new Price()
                .id(1)
                .price(20)
                .nomenclature(new Nomenclature(1, "Хлуб", "Пшеничный"))
                .counterparty(new Counterparty(1, "Батон", "Возле дома"))
                .create(new Date())
        );
        LIST.add(new Price()
                .id(2)
                .price(40)
                .nomenclature(new Nomenclature(1, "Сок", "Клубничный"))
                .counterparty(new Counterparty(1, "Батон", "Возле дома"))
                .create(new Date())
        );
    }

    @Override
    @PostMapping
    public Price save(@RequestBody Price body) {
        logger.info(body.toString());
        if (LIST.size() > 0) {
            body.setId(LIST.get(LIST.size() - 1).getId() + 1);
        } else {
            body.setId(1);
        }
        LIST.add(body);
        logger.info(body.toString());
        return body;
    }

    @Override
    @GetMapping("/{ID}")
    public Price findById(@PathVariable(value = "ID") long id) {
        for (var price : LIST) {
            if (price.getId() == id) {
                return price;
            }
        }
        return null;
    }

    @Override
    @GetMapping
    public List<Price> findAll() {
        return LIST;
    }
}
