package ru.youlshin.order.controller;

import org.springframework.web.bind.annotation.*;
import ru.youlshin.order.entity.Price;
import ru.youlshin.order.repository.PriceRepository;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/price")
public class PriceController extends BaseController<Price> {
    public PriceController(PriceRepository repository) {
        super(repository);
    }

    @Override
    @PostMapping
    public Price save(@RequestBody Price body) {
        body.setCreate(new Date());
        return super.save(body);
    }

    @GetMapping(value = "/find")
    public Price findByNomenclatureAndCounterparty(
            @RequestParam(value = "nID") long nID,
            @RequestParam(value = "cID") long cID)
    {
        return ((PriceRepository)repository)
                .findFirstByNomenclatureIdAndCounterpartyIdOrderByCreateDesc(nID, cID);
    }
}
