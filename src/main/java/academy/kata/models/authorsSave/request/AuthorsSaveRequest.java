package academy.kata.models.authorsSave.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class AuthorsSaveRequest {
    private String firstName;
    private String familyName;
    private String secondName;
    private String contentType;
}
