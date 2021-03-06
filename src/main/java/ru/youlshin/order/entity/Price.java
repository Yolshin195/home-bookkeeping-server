package ru.youlshin.order.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal price;
    private Date create;
    @ManyToOne
    private Counterparty counterparty;
    @ManyToOne
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

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Price price(BigDecimal price) {
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
