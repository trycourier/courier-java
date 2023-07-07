package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class AutomationAdhocRequestBody {
    public AdhocAutomation automation;
    private String brand;
    private String template;
    private String recipient;
    private HashMap<String, Object> data;
    private HashMap<String, Object> profile;
}
