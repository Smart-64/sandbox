package pattern.creational.config;

import pattern.creational.model.Product;
import pattern.creational.model.ProductA;
import pattern.creational.model.ProductB;

// Паттерн проектирования порождающий: Factory Method.
public class FactoryProduct {
    public static Product createProduct(String type) {
        if (type.equals("A")) return new ProductA();
        if (type.equals("B")) return new ProductB();
        throw new IllegalArgumentException("Unknown type");
    }
}
