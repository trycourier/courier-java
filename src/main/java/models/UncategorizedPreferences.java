package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UncategorizedPreferences {
    private String id;
    private String title;
    private PreferenceConfig config;
}
