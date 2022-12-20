package singleResponsibility.chapter2;

import singleResponsibility.chapter2.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

    private static List<Product> products = new ArrayList<>();

    public void add(Product product) {
        if (product.getCategory().isEmpty()) {
            throw new NullPointerException("Category cannot be blank");
        }else if(product.getPrice() <= 0) {
            throw new NullPointerException("Price cannot be less than zero");
        }
        //db conn logic
        products.add(product);
    }


    public List<Product> getAll() {
        // db conn logic
        return products;
    }
}
