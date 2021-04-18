package ru.youlshin.order.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Nomenclature nomenclature;
    @JsonIgnore
    @ManyToOne
    private Order order;
    private BigDecimal amount;
    private BigDecimal price;
    private BigDecimal sum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Nomenclature getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nomenclature=" + nomenclature +
                ", order=" + order +
                ", amount=" + amount +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }
}
