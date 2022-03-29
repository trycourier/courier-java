package models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import java.util.HashMap;

@Getter
@Setter
@ToString
public class Audience {
  @NonNull
  public HashMap<String, Object> filter;
  public String id;
  public String name;
  public String description;
  public String createdAt;
  public String updatedAt;
}
