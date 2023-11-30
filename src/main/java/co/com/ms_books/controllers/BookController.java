package co.com.ms_books.controllers;

import co.com.ms_books.models.Book;
import co.com.ms_books.services.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
@Tag(name = "Libros", description = "Operaciones sobre los libros")
public class BookController {
    private final BookService bookService;

    @PostMapping
    @Operation(summary = "Crear un nuevo libro", description = "Permite crear un nuevo libro")
    @Parameter(name = "Libro", description = "Libro a crear",
            content = @Content(schema = @Schema(implementation = Book.class)))
    @ApiResponse(responseCode = "200", description = "Libro Creado",
            content = @Content(schema = @Schema(implementation = Book.class)))
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
