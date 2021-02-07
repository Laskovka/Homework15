package ua.com.alevel.Task5;

import ua.com.alevel.Task4.Album;
import ua.com.alevel.Task4.Book;
import ua.com.alevel.Task4.Booklets;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Album> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        copyToBooks(booksSource, booksDestination);
    }


    public static void copyToBooks(List<? extends Book> src, List<Book> dest) {
        for (Book book : src) {
            dest.add(book);
        }
    }
}
