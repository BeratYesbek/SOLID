package singleResponsibility.chapter3;
public class Chapter3Application {

    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();

        Product product1 = new Product(1, 15000, "Iphone 13", "Phone");
        Product product2 = new Product(2, 14000, "Samsung S22", "Phone");
        Product product3 = new Product(3, 10000, "Asus Notebook", "Computer");

        productService.add(product1);
        productService.add(product2);
        productService.add(product3);

        for (Product product : productService.getAll()) {
            System.out.println(product.toString());
        }
    }
}
