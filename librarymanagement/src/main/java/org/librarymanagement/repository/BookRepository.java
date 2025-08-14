package org.librarymanagement.repository;

import org.librarymanagement.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    @Query("Select b From Book b"
            + "Left join b.publisher p"
            + "Left join b.bookAuthor ba +"
            + "Left join ba.author a"
            + "Left join b.bookGenres bg"
            + "Left join bg.genre g"
            + "Where(:title is null or lower(b.title) like lower(concat('%', :title, '%')))"
            + "And (:author is null or lower(a.name) like lower(concat'%', :author, '%')))"
            + "And (:category is null or lower(g.name) like lower(concat'%', :category, '%')))"
            + "And (:publisher is null or lower(p.name) like lower(concat'%', :publisher, '%')))")
    List<Book> searchBooks(
            @Param("title") String title,
            @Param("author") String author,
            @Param("category") String category,
            @Param("publisher") String publisher
    );
}
