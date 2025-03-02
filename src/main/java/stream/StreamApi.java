package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

//        List<Integer> intStream = List.of(1, 2, 3, 4, 5);
//        List<Integer> result = intStream.stream().filter(element -> element > 3).collect(Collectors.toList());
//        System.out.println(result);

//        List<String> stringStream = List.of("hello", "bye", "color", "damage", "exception");
//        System.out.println(stringStream.stream().map(String::length).collect(Collectors.toList()));
//        System.out.println(stringStream.stream().flatMap(s -> Arrays.stream(s.split(" "))));

//        Path path = Path.of("src/main/resources/file.txt");
//        try (Stream<String> lines = Files.lines(path)) {
//            lines.forEach(System.out::println);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        List<String> list = List.of("Hello", "world");

        List<Character> resultListFlatMap = list.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(resultListFlatMap);

        List<Stream<Character>> resultListMap = list.stream()
                .map(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(resultListMap);
    }
}