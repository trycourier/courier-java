package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AdhocAutomation {
    private List<Object> steps;
    private Object cancelation_token;
}
