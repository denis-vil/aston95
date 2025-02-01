package streamAPI;

import java.util.List;

public class Author {
    List<Book> books;
    String name;

    public Author(List<Book> books, String name) {
        this.books = books;
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}