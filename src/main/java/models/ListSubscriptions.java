package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListSubscriptions {
    private Paging paging;
    private java.util.List<Subscription> items;
}
