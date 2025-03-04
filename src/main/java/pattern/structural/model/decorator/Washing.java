package pattern.structural.model.decorator;

public class Washing implements Service {
    private final String label;
    private final int price;

    public Washing(String label, int price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
