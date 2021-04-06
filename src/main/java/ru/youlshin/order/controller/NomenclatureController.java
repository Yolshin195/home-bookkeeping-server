package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.youlshin.order.entity.Nomenclature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/nomenclature")
public class NomenclatureController {
    private static final List<Nomenclature> nomenclatureList = new ArrayList<>();
    static {
        nomenclatureList.add(new Nomenclature(1, "Хлеб", "Пшеничный"));
        nomenclatureList.add(new Nomenclature(2, "Молоко", "Отборное 2л"));
        nomenclatureList.add(new Nomenclature(3, "Квас", "На брульках"));
        nomenclatureList.add(new Nomenclature(4, "Доширак", "Куринный"));
    }

    @GetMapping
    public List<Nomenclature> getAll() {
        return nomenclatureList;
    }
}
