package co.com.ms_books.controllers;

import co.com.ms_books.models.Book;
import co.com.ms_books.services.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class BookControllerTest {
    @Mock
    BookService bookService;

    @InjectMocks
    BookController bookController;

    Book book;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        book = new Book();
        book.setTitle("Libro 1");
        book.setAuthor("Author 1");
    }

    @Test
    void createBookTest() {
        when(bookService.createBook(any())).thenReturn(book);
        Book result = bookController.createBook(book);
        Assertions.assertEquals(book, result);
    }
}