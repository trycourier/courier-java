package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountRequestBody {
    private String name;
    private String parent_account_id;
    private Object default_preferences;
    private Object properties;
    private Object user_profile;
    private String brand_id;
}
