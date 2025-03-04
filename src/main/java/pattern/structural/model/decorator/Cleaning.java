package pattern.structural.model.decorator;

public class Cleaning implements Service {
    private final String label;
    private final int price;

    public Cleaning(String label, int price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
