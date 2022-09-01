package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BulkJobUserResponseItem extends BulkIngestUser {
    private String messageId;
    private String status;
}
