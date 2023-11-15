package academy.kata.models.authorGetAllBooksXML.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class AuthorGetAllBooksXMLResponse {
    private List<Object> book;
    private List<Object> author;
}
