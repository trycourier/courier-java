package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendRequestBody {
    private String event;
    private String recipient;
    private String brand;
    private String data;
    private String override;
    private String preferences;
    private String profile;
}
