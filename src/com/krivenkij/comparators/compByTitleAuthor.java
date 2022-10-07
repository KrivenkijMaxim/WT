package com.krivenkij.comparators;

import com.krivenkij.task_12_16.Book;

import java.util.Comparator;

public class compByTitleAuthor implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public compByTitleAuthor() {
        this.comparator = new compByTitle().thenComparing(new compByAuthor());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }

}
