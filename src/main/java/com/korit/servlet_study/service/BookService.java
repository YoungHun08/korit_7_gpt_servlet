package com.korit.servlet_study.service;

public class BookService {
    private static BookService bookservice;

    private BookService() {

    }

    public static BookService getInstance() {
        if (bookservice == null) {
            bookservice = new BookService();
        }
        return bookservice;
    }
}
