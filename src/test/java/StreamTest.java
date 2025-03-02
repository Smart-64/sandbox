import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void test() {
        List<String> words = Arrays.asList("Hello", "World");
        List<Stream<Character>> symbolsMap = words.stream()
                .map(word -> word.chars().mapToObj(c -> (char) c))
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(symbolsMap);

        List<Character> symbolsFlatMap = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(symbolsFlatMap);
    }

    @Test
    public void testMAin() {
        Calculate calculate = new Calculate();
        String answer = calculate.calculateStats("5 -2 0 0 7 8 -1");

        Assert.assertEquals("выше нуля: 3, ниже нуля: 2, равна нулю: 2", answer);
    }
}
