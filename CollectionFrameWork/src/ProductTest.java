import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Laptop", 800.00, "Electronics");
        Product product2 = new Product("Smartphone", 500.00, "Electronics");
        Product product3 = new Product("Headphones", 150.00, "Electronics");
        Product product4 = new Product("Watch", 200.00, "Accessories");
        Product product5 = new Product("Shoes", 60.00, "Footwear");
        Product product6 = new Product("Shirt", 30.00, "Clothing");
        Product product7 = new Product("Bag", 40.00, "Accessories");
        Product product8 = new Product("Jacket", 120.00, "Clothing");
        Product product9 = new Product("Tablet", 300.00, "Electronics");
        Product product10 = new Product("Coffee Maker", 70.00, "Appliances");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        System.out.println(products);

    }
}
