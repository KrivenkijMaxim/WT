package com.krivenkij.task_12_16;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return level == programmerBook.level && language.equals(programmerBook.language) && super.equals(obj);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + super.hashCode();
        result = prime * result + level;
        return result;
    }


    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language= " + language +
                ",level= " + level +
                '}';
    }

}
