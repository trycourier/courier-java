package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PreferenceConfig {
    private boolean inheritConfig;
    private boolean required;
}
