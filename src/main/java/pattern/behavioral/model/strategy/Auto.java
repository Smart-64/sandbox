package pattern.behavioral.model.strategy;

public class Auto {
    private FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void drive() {
        System.out.println("Движение вперед.");
    }

    public void stop() {
        System.out.println("Торможение.");
    }

    public void fill() {
        fillStrategy.fill();
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
