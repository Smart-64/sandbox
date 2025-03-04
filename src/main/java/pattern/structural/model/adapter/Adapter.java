package pattern.structural.model.adapter;

/**
 * Паттерн проектирования структрный: Adapter.
 */
public class Adapter implements USB {
    MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        System.out.println(memoryCard.getData());
        System.out.println(memoryCard.getInputDate());
    }
}
