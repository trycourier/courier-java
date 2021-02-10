package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BrandCreateBody {
    private String id;
    private String name;
    private Settings settings;
    private Snippets snippets;
}
