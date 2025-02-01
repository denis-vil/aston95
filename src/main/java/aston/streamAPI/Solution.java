package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.stream()
                .flatMap((x) -> x.getBooks().stream())
                .distinct()
                .flatMap((book) -> book.getChapters().stream())
                .count();

        authors.stream()
                .filter(author -> author.getBooks().size() > 3)
                .flatMap((author) -> author.getBooks().stream())
                .filter(book -> book.getName().startsWith("S"))
                .flatMap((book) -> book.getChapters().stream())
                .findFirst();

        authors.stream()
                .flatMap((author) -> author.getBooks().stream())
                .flatMap((book) -> book.getChapters().stream())
                .mapToInt((chapter) -> chapter.getName().length())
                .average();

        Arrays.stream(new int[]{1, 2, 3, 4})
                .peek(System.out::println) // 1,2,3,4
                .sorted()
                .peek(System.out::println)
                .anyMatch(x -> x == 3); // 1,2,3
    }
}