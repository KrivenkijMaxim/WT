package com.krivenkij.task_12_16;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;


    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public int getIsbn(){
        return isbn;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return price == book.price &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + price;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title= " + title +
                ",author= " + author +
                ",price= " + price +
                ",edition= " + edition +
                ",ISBN= " + isbn +
                '}';
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        clone.title = this.title;
        clone.author = this.author;
        clone.price = this.price;
        clone.isbn = this.isbn;
        return clone;
    }

    @Override
    public int compareTo(Book book){
        return this.isbn - book.isbn;
    }
}
