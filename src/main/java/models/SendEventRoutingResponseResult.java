package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class SendEventRoutingResponseResult {
    private String recipient;
    private HashMap<String, Object> routing;
}