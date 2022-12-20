package singleResponsibility.chapter1;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    private int id;
    private int price;
    private String name;
    private String category;

    public Product(int id, int price, String name, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public List<Product> getAll() {
        // db conn logic
        return null;
    }

    public void add(Product product) {
        // db conn logic
    }
}
