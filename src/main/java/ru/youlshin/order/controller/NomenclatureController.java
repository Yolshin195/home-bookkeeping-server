package ru.youlshin.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Nomenclature;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/nomenclature")
public class NomenclatureController implements Controller<Nomenclature> {
    private static final Logger logger = LoggerFactory.getLogger(NomenclatureController.class);
    private static final List<Nomenclature> NOMENCLATURE_LIST = new ArrayList<>();
    static {
        NOMENCLATURE_LIST.add(new Nomenclature(1, "Хлеб", "Пшеничный"));
        NOMENCLATURE_LIST.add(new Nomenclature(2, "Молоко", "Отборное 2л"));
        NOMENCLATURE_LIST.add(new Nomenclature(3, "Квас", "На брульках"));
        NOMENCLATURE_LIST.add(new Nomenclature(4, "Доширак", "Куринный"));
    }

    @Override
    @GetMapping("/{ID}")
    public Nomenclature get(@PathVariable(value="ID") long id) {
        for (Nomenclature nomenclature : NOMENCLATURE_LIST) {
            if (nomenclature.getId() == id) return nomenclature;
        }
        return null;
    }

    @Override
    @GetMapping
    public List<Nomenclature> getAll() {
        return NOMENCLATURE_LIST;
    }

    @Override
    @PostMapping
    public Nomenclature add(@RequestBody Nomenclature body) {
        logger.info(body.toString());
        var nomenclature = new Nomenclature(
                NOMENCLATURE_LIST.get(NOMENCLATURE_LIST.size() - 1).getId() + 1,
                body.getTitle(),
                body.getDescription()
        );

        NOMENCLATURE_LIST.add(nomenclature);
        logger.info(nomenclature.toString());
        return nomenclature;
    }
}
