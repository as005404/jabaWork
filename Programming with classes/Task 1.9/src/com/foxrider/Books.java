package com.foxrider;

import java.util.Arrays;

public class Books {
    Book[] books;

    Books(Book... b) {
        books = b.clone();
    }

    public void booksByAuthor(String author) {
        for (var book : books) {
            for (var creator:book.getAutors()) {
                if(creator.equalsIgnoreCase(author)){
                    System.out.println(book);
                    break;
                }
            }
        }
    }

    public void booksByPublishingHause(String publishingHouse) {
        for (var book :
                books) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                System.out.println(book);
            }
        }
    }

    public void booksAfterYear(int year) {
        for (var book :
                books) {
            if (book.getYearOfpublishing() >= year) {
                System.out.println(book);
            }
        }
    }

}
