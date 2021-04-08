package ru.youlshin.order.entity;

import java.util.Arrays;
import java.util.Date;

public class Order {
    private long id;
    private Counterparty counterparty;
    private Product[] productList;
    private Date create;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList) {
        this.productList = productList;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", counterparty=" + counterparty +
                ", productList=" + Arrays.toString(productList) +
                ", create=" + create +
                '}';
    }
}
