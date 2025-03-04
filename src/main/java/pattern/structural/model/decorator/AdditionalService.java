package pattern.structural.model.decorator;

/**
 * Паттерн проектирования структрный: Decorator.
 */
public class AdditionalService implements Service {
    private final String label;
    private final int price;

    private int totalCost;

    public AdditionalService(Service service, String label, int price) {
        this.service = service;
        this.label = label;
        this.price = price;
        this.totalCost = price + service.getPrice();
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public Service getService() {
        return service;
    }

    private final Service service;

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "AdditionalService[" +
                "label='" + label + '\'' +
                ", service='" + service.getLabel() +
                "', price=" + price +
                ", totalCost=" + totalCost +
                "]";
    }
}
