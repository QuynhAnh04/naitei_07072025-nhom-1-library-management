package org.librarymanagement.service;

import org.librarymanagement.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> searchBooks(String title, String author, String category, String publisher);
}
