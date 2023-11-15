package academy.kata.models.booksSave.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class BooksSaveRequest {
    private String book_title;
    private Object author;
    private long authorId;
    private String contentType;
}
