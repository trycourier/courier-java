package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendListRequestBody {
    private String list;
    private String pattern;
    private String event;
    private String brand;
    private String data;
    private String override;
}
