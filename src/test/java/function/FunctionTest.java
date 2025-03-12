package function;

import org.junit.Test;

public class FunctionTest {

    int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("divided by 0");
        }

        return a / b;
    }

    void assertEquals(int a, int b) {
        if (a == b) {
            System.out.println("passed");
            return;
        }

        throw new RuntimeException("failed: expected " + a + ", actual " + b);
    }

    void answer() {
        System.out.println("answer");
    }

}
