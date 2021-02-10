package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PureLists {
    private Paging paging;
    private java.util.List<List> items;
}
