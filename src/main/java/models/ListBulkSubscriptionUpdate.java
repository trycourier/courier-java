package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ListBulkSubscriptionUpdate {
    List<Recipient> recipients;
}
