package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class InboundBulkMessageApiV1 {
    private HashMap<String, Object> data;
    private String brand;
    private String event;
    private HashMap<String, Object> override;
    private String locale;
}
