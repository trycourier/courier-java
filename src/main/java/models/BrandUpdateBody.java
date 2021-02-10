package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BrandUpdateBody {
    private String name;
    private Settings settings;
    private Snippets snippets;
}
