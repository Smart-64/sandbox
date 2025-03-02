package bank;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class ATMTest {

    // TODO: Добавить новые тесты;
    @Test
    public void test() {
        Map<Integer, Integer> mapBanknotes = new HashMap<>();
        mapBanknotes.put(5000, 1);
        mapBanknotes.put(1000, 100);
        mapBanknotes.put(500, 100);
        mapBanknotes.put(100, 100);
        mapBanknotes.put(50, 100);
        Sdk sdk = new StubSdk(mapBanknotes);
        ATM atm = new ATM(sdk);
        atm.request(11000);

        Assert.assertEquals(0, sdk.countBanknotes(5000));
        Assert.assertEquals(94, sdk.countBanknotes(1000));
        Assert.assertEquals(100, sdk.countBanknotes(500));
        Assert.assertEquals(100, sdk.countBanknotes(100));
        Assert.assertEquals(100, sdk.countBanknotes(50));
    }

    @Test
    public void testNull() {

    }

}