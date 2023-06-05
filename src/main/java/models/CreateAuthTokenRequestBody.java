package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateAuthTokenRequestBody {
    private String scope;
    private String expires_in;
}
