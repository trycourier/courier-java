package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PreferenceCategory {
    private String id;
    private String title;
    private PreferenceConfig config;
    private List<Notification> notifications;
}
