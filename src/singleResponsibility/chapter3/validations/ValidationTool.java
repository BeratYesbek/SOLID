package singleResponsibility.chapter3.validations;

import singleResponsibility.chapter3.Product;

public class ValidationTool {

    public static void productValidation(Product product) {
        if (product.getCategory().isBlank()) {
            throw new NullPointerException("Category cannot be null");
        } else if (product.getName().isBlank()) {
            throw new NullPointerException("Name cannot be null");
        } else if (product.getPrice() <= 0) {
            throw new NullPointerException("Price cannot be zero and less than zero");
        }
    }
}
