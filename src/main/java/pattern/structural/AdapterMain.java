package pattern.structural;

import pattern.structural.model.adapter.Adapter;
import pattern.structural.model.adapter.MemoryCard;

/**
 * Паттерн проектирования структрный: Adapter.
 */
public class AdapterMain {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard("Проверка записи новых данных с помощью USB.");
        Adapter adapter = new Adapter(memoryCard);
        adapter.connectWithUsbCable();
    }
}
