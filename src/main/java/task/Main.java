package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//  Дано: На лесной поляне собралось несколько зверей: три ёжика, два мишки и один заяц.

        List<Animal> animals = List.of(
                new Hare(Color.RED),
                new Hedgehog(Color.RED),
                new Bear(Color.RED),
                new Hare(Color.BLUE),
                new Hedgehog(Color.BLUE),
                new Bear(Color.BLUE),
                new Hare(Color.YELLOW),
                new Hedgehog(Color.YELLOW),
                new Bear(Color.YELLOW)
                );

        System.out.println(sort(animals));





//  Все звери внутри одного вида - разного цвета. Всего разных цветов - 3.
//  Мишка может съесть зайца. Ёжика никто съесть не может.
//  Требуется:     Написать функцию, которая разбивает зверей с поляны на кучки в зависимости от цвета
//  (т.е. в одной и той же кучке у всех один и тот же цвет) и "взаимной безопасности" в этой кучке.
//  Для справки:   Ежик - Hedgehog, Мишка - Bear, Заяц - Hare

    }

    public static List<List<Animal>> sort(List<Animal> animals) {
        Map<Color, List<Animal>> colorMap = animals.stream().collect(Collectors.groupingBy(Animal::getColor));
//        for (Animal animal: animals) {
//            if (colorMap.containsKey(animal.color)) {
//                colorMap.get(animal.color).add(animal);
//            } else {
//                colorMap.put(animal.color, new ArrayList<>(List.of(animal)));
//            }
//        }
        List<List<Animal>> resultList = new ArrayList<>();
        for (Map.Entry<Color, List<Animal>> colorListEntry : colorMap.entrySet()) {
            List<Animal> heap = new ArrayList<>();
            for (Animal animal : colorListEntry.getValue()) {
                for (Animal animalInHeap : heap) {
                    if (animalInHeap.eat(animal) || animal.eat(animalInHeap)) {
                        resultList.add(heap);
                        heap = new ArrayList<>();
                        break;
                    }
                }
                heap.add(animal);
            }
            resultList.add(heap);
        }
        return resultList;
    }
}

enum Color{
    RED,
    BLUE,
    YELLOW
}

abstract class Animal {
    public Color getColor() {
        return color;
    }

    final Color color;
    abstract boolean eat(Animal animal);

    public Animal(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "(" + getClass().getSimpleName() +
                " color=" + color +
                ")";
    }
}

class Bear extends Animal {
    public Bear(Color color) {
        super(color);
    }

    @Override
    boolean eat(Animal animal) {
        return animal instanceof Hare;
    }
}

class Hare extends Animal {
    public Hare(Color color) {
        super(color);
    }

    @Override
    boolean eat(Animal animal) {
        return false;
    }
}

class Hedgehog extends Animal {
    public Hedgehog(Color color) {
        super(color);
    }

    @Override
    boolean eat(Animal animal) {
        return false;
    }
}
