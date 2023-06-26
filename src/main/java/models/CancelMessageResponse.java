package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CancelMessageResponse {
  private long canceledAt;
  private String event;
  private String id;
  private String recipient;
  private String status;
  private long clicked;
  private long delivered;
  private long enqueued;
  private String error;
  private String jobId;
  private String listId;
  private String listMessageId;
  private String notification;
  private long opened;
  private String runId;
  private long sent;
}
