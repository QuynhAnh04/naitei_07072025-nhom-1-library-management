package org.librarymanagement.service.impl;

import org.librarymanagement.entity.Book;
import org.librarymanagement.repository.BookRepository;
import org.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> searchBooks(String title, String author, String category, String publisher) {
        return bookRepository.searchBooks(title, author, category, publisher);
    }
}
