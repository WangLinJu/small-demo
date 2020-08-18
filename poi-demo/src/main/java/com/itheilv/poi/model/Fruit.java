package com.itheilv.poi.model;

/**
 * @author WSQ
 * @since 2020-08-06
 */
public class Fruit {
    /**
     * 水果名称.
     */
    private String name;
    /**
     * 水果价格.
     */
    private String price;

    public Fruit() {
    }

    public Fruit(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
