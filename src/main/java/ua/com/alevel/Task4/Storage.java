package ua.com.alevel.Task4;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }

    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        List<Booklets> albums1 = new ArrayList<>();
        storage.addAll(albums);
        storage.addAll(albums1);
    }
}
