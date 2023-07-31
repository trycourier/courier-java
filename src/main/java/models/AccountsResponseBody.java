package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@ToString
public class AccountsResponseBody {
    private List<models.Account> items;
    private Boolean has_more;
    private String next_url;
    private String url;
}
