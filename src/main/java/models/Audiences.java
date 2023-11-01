package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@ToString
public class Audiences {
  private Paging paging;
  private List<models.Audience> items;
}
