package com.krivenkij.comparators;

import com.krivenkij.task_12_16.Book;

import java.util.Comparator;

public class compByPrice implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPrice() - book2.getPrice();
    }
}
