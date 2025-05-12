package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price + "원";
    }
}
