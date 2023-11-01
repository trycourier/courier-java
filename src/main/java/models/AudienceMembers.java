package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@ToString
public class AudienceMembers {
  private Paging paging;
  private List<models.AudienceMember> items;
}
