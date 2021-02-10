package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Message {
    private long clicked;
    private long delivered;
    private long enqueued;
    private String error;
    private String event;
    private String id;
    private String notification;
    private long opened;
    private List<Provider> providers;
    private String reason;
    private String recipient;
    private long sent;
    private String status;
}
