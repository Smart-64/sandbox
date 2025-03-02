package hh;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

    @Test
    public void testMAin() {
        Calculate calculate = new Calculate();
        String answer = calculate.calculateStats("5 -2 0 0 7 8 -1");

        Assert.assertEquals("выше нуля: 3, ниже нуля: 2, равна нулю: 2", answer);
    }
}
