package com.krivenkij.comparators;

import com.krivenkij.task_12_16.Book;

import java.util.Comparator;

public class compByAuthorTitle implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public compByAuthorTitle() {
        this.comparator = new compByAuthor().thenComparing(new compByTitle());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }

}
