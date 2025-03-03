package pattern.creational;

import pattern.creational.config.FactoryProduct;
import pattern.creational.model.Product;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Product productA = FactoryProduct.createProduct("A");
        System.out.println(productA);
        productA.use();
    }
}
