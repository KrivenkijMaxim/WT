package com.krivenkij.comparators;

import com.krivenkij.task_12_16.Book;

import java.util.Comparator;

public class compByAuthorTitlePrice implements Comparator<Book>{

    private final Comparator<Book> comparator;

    public compByAuthorTitlePrice(Comparator<Book> comparator) {
        this.comparator = new compByAuthorTitle().thenComparing(new compByPrice());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }

}
