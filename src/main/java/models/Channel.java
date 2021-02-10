package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Channel {
    private String key;
    private String name;
    private String template;
}
