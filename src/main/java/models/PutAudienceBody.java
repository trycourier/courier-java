package models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import java.util.HashMap;


@Getter
@Setter
@ToString
public class PutAudienceBody {
    @NonNull
    public HashMap<String, Object> filter;
    @NonNull
    public String id;
    public String name;
    public String description;
}
