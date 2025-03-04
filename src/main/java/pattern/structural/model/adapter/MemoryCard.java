package pattern.structural.model.adapter;

public class MemoryCard {
    private final String inputDate;

    public MemoryCard(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getData() {
        return "Данные на карте памяти загружены.";
    }

    public String getInputDate() {
        return inputDate;
    }
}
