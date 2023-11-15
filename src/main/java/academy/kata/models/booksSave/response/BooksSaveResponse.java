package academy.kata.models.booksSave.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class BooksSaveResponse {
    private long bookId;
}
