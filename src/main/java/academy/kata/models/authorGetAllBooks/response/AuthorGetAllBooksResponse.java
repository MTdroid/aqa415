package academy.kata.models.authorGetAllBooks.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class AuthorGetAllBooksResponse {
    private List<Object> book;
    private List<Object> author;
}
