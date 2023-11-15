package academy.kata.models.authorGetAllBooksXML.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;



@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class AuthorGetAllBooksXMLRequest {
    private int id;
    private String contentType;
    private  Object author;
}
