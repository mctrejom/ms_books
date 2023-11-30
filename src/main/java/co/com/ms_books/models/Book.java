package co.com.ms_books.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Schema(description = "Schema de Libro")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Id unico del libro", example = "1")
    private Long id;
    @Schema(description = "Titulo del libro", example = "Un mundo feliz")
    private String title;
    @Schema(description = "Autor del libro", example = "Aldous Huxley")
    private String author;
}
