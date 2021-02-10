package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Preferences {
    private List<UncategorizedPreferences> uncategorized;
    private List<PreferenceCategory> categories;
}
