package bank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Банкомат.
 * Взаимодействует с SDK, контракты для которого описаны ниже.
 * Необходимо реализовать запрос на выдачу определенной суммы (в рублях).
 * В случае, если нужную сумму выдать невозможно, отвечать отказом.
 * Допустимые номиналы: 50₽, 100₽, 500₽, 1000₽, 5000₽.
 */
public class ATM {

    // TODO: улучшить код;
    private final Sdk sdk;
    private final Map<Integer, Integer> mapBanknotes;

    public ATM(Sdk sdk) {
        this.sdk = sdk;
        mapBanknotes = cacheBanknotes(sdk);
    }
    // 11 000, в банкомате 1 купюра 5000, др. в избытке
    public void request(int amount) {
        Map<Integer, Integer> mapMoveBanknotes = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : mapBanknotes.entrySet()) {
            int countBanknotes = amount/entry.getKey();
            int moveBanknotes = Math.min(entry.getValue(), countBanknotes);
            amount = amount - moveBanknotes * entry.getKey();
            mapMoveBanknotes.put(entry.getKey(), moveBanknotes);
        }

        if (amount > 0) {
            throw new RuntimeException("В банкомате нет нужного количества купюр");
        }

        for (Map.Entry<Integer, Integer> entry : mapMoveBanknotes.entrySet()) {
            mapBanknotes.put(entry.getKey(), mapBanknotes.get(entry.getKey()) - entry.getValue());
            sdk.moveBanknoteToDispenser(entry.getKey(), entry.getValue());
        }

        sdk.openDispenser();
    }

    private Map<Integer, Integer> cacheBanknotes(Sdk sdk) {
        Map<Integer, Integer> mapBanknotes = new LinkedHashMap<>();
        mapBanknotes.put(5000, null);
        mapBanknotes.put(1000, null);
        mapBanknotes.put(500, null);
        mapBanknotes.put(100, null);
        mapBanknotes.put(50, null);
        for (Map.Entry<Integer, Integer> entry: mapBanknotes.entrySet()) {
            int count = sdk.countBanknotes(entry.getKey());
            mapBanknotes.put(entry.getKey(), count);
        }

        return mapBanknotes;
    }

}
