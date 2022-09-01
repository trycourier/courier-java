package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BulkIngestError {
    private Object user;
    private Object error;
}
