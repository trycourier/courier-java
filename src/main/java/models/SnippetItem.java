package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SnippetItem {
    private String format;
    private String name;
    private String value;
}
