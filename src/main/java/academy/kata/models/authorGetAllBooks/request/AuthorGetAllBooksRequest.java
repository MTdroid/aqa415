package academy.kata.models.authorGetAllBooks.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class AuthorGetAllBooksRequest {
    private String id;
    private String contentType;
}
