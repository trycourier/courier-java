package models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AudienceMember {
  public String addedAt;
  public String audienceId;
  public String audienceVersion;
  public String memberId;
  public String reason;
}
