package pattern.structural;

import pattern.structural.model.decorator.AdditionalService;
import pattern.structural.model.decorator.Cleaning;
import pattern.structural.model.decorator.Service;
import pattern.structural.model.decorator.Washing;

/**
 * Паттерн проектирования структрный: Decorator.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Service washing = new Washing("Мойка посуды", 500);
        Service cleaning = new Cleaning("Уборка квартиры", 2000);

        System.out.println(cleaning.getPrice());
        System.out.println(washing.getPrice());

        AdditionalService additionalService = new AdditionalService(cleaning ,"Вынос мусора", 100);
        System.out.println(additionalService.toString());
    }
}
