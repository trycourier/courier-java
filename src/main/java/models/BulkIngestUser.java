package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class BulkIngestUser {
    private String recipient;
    private HashMap<String, Object> profile;
    private HashMap<String, Object> data;
    private Object preferences;
    private Object to;
}
