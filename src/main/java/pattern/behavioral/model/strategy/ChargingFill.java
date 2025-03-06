package pattern.behavioral.model.strategy;

public class ChargingFill implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заряжаем электромобиль электричеством");
    }
}
