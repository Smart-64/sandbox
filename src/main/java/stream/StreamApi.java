package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

//        List<Integer> intStream = List.of(1, 2, 3, 4, 5);
//        List<Integer> result = intStream.stream().filter(element -> element > 3).collect(Collectors.toList());
//        System.out.println(result);

//        List<String> stringStream = List.of("hello", "bye", "color", "damage", "exception");
//        System.out.println(stringStream.stream().map(String::length).collect(Collectors.toList()));
//        System.out.println(stringStream.stream().flatMap(s -> Arrays.stream(s.split(" "))));

        Path path = Path.of("src/main/resources/file.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}