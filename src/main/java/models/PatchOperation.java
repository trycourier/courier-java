package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatchOperation {
    private String op;
    private String path;
    private String value;
}
