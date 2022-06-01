package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class SendEventRoutingRequestRecipient {
    private String recipient;
    private HashMap<String, Object> data;
    private HashMap<String, Object> preferences;
    private HashMap<String, Object> profile;
}