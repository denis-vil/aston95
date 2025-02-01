package streamAPI;

import java.util.stream.Stream;

public class SolutionAPI {
    public static void main(String[] args) {
        Stream
                .generate(() -> "Hi")
                .limit(21)
                .forEach(System.out::println);
    }
}