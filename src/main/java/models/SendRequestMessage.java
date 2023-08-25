package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class SendRequestMessage {
    private Object to;
    private HashMap<String, Object> data;
    private HashMap<String, Object> channels;
    private HashMap<String, Object> providers;
    private HashMap<String, String> expiry;
    private MessageContext context;
    private SendRequestMessageRouting routing;
    private String brand_id;
    private String template;
    private Object content;
    private Object metadata;
    private Object timeout;
    private Object delay;
}
