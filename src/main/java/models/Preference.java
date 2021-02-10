package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class Preference {
    private HashMap<String, Object> categories;
    private HashMap<String, Object> notifications;
}
