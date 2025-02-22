package bank;

import java.util.Map;

/**
 * Пример реализации SDK, которую можно использовать в тестах.
 * Реализацию можно и нужно менять.
 */
class StubSdk implements Sdk {

    private final Map<Integer, Integer> mapBanknotes;

    public StubSdk(Map<Integer, Integer> mapBanknotes) {
        this.mapBanknotes = mapBanknotes;
    }

    @Override
    public int countBanknotes(int banknote) {
        return mapBanknotes.get(banknote);
    }

    @Override
    public void moveBanknoteToDispenser(int banknote, int count) {
        mapBanknotes.put(banknote, mapBanknotes.get(banknote) - count);
        System.out.printf("Перемещаю купюру %s в лоток выдачи, %s штук%n", banknote, count);
    }

    @Override
    public void openDispenser() {
        System.out.printf("Лоток выдачи открыт пользователю%n");
    }
}
