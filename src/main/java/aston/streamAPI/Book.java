package streamAPI;

import java.util.List;

public class Book {
    List<Chapter> titles;
    String name;

    public Book(List<Chapter> titles, String name) {
        this.titles = titles;
        this.name = name;
    }

    public List<Chapter> getChapters() {
        return titles;
    }

    public void setChapters(List<Chapter> titles) {
        this.titles = titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}