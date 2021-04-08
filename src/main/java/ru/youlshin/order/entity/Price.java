package ru.youlshin.order.entity;

import java.util.Date;

public class Price {
    private long id;
    private long price;
    private Date create;
    private Counterparty counterparty;
    private Nomenclature nomenclature;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Price id(long id) {
        this.id = id;
        return this;
    }

    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public Price price(long price) {
        this.price = price;
        return this;
    }

    public Date getCreate() {
        return create;
    }
    public void setCreate(Date create) {
        this.create = create;
    }
    public Price create(Date create) {
        this.create = create;
        return this;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }
    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }
    public Price counterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public Nomenclature getNomenclature() {
        return nomenclature;
    }
    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }
    public Price nomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
        return this;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", price=" + price +
                ", create=" + create +
                ", counterparty=" + counterparty +
                ", nomenclature=" + nomenclature +
                '}';
    }
}
