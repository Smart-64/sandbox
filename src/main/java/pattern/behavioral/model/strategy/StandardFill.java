package pattern.behavioral.model.strategy;

public class StandardFill implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляем автомобиль бензином");
    }
}
