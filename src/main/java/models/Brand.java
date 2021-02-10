package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Brand {
    private long created;
    private String id;
    private String name;
    private long published;
    private Settings settings;
    private long updated;
    private Snippets snippets;
}
