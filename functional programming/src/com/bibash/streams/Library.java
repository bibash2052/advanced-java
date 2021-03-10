package com.bibash.streams;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> bookList = showBooks();

        //the code below uses multiple cores of cpu to perform the task
        bookList.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).forEach(System.out::println);

        //the code below uses the single core to do the task
        bookList.stream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).forEach(System.out::println);
    }

    static List<Book> showBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("ABC", "qwe"));
        bookList.add(new Book("ABC", "tyr"));
        bookList.add(new Book("ABC", "ioop"));
        bookList.add(new Book("EFG", "gh"));
        bookList.add(new Book("EFG", "jhg"));
        bookList.add(new Book("EFG", "ytr"));
        bookList.add(new Book("EFG", "hnhg"));
        bookList.add(new Book("Qwerty", "pp"));
        bookList.add(new Book("MMMM", "dfghj"));
        bookList.add(new Book("MMMM", "asdad"));
        bookList.add(new Book("MMMM", "asdadsads"));
        bookList.add(new Book("MMMM", "asdsad"));
        bookList.add(new Book("ABC", "qhh"));
        bookList.add(new Book("ABC", "kkkllk"));
        return bookList;
    }
}
