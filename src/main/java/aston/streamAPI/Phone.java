package streamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Phone {
    int number;

    Phone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1, 2, 3, 1, 4};

        Map<Integer, Long> frequencyMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        frequencyMap.forEach((element, count) -> System.out.println(element + " -> " + count));

        Stream.of(new Phone(1), new Phone(2), new Phone(3))
                .flatMap(phone -> Stream.generate(() -> phone.getNumber()).limit(phone.getNumber() == 1 ? 2 : (phone.getNumber() == 2 ? 3 : phone.getNumber())))
                .forEach(System.out::println);

        Stream.of("d1", "c2", "a1", "b3")
                .map(s -> {
                            System.out.println(s); // "d1", "c2", "a1", "b3"
                            return s.toUpperCase();
                        }
                )
                .sorted()
                .anyMatch(s -> {
                    System.out.println(s);  // "d1", "c2", "a1", "b3" UpperCase
                    return s.startsWith("C");
                });
    }
}