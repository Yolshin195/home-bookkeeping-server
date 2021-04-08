package ru.youlshin.order.entity;

public class Product {
    private long id;
    private Nomenclature nomenclature;
    private int amount;
    private int price;
    private int sum;

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nomenclature=" + nomenclature +
                ", amount=" + amount +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }
}
