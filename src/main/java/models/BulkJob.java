package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BulkJob {
    private long enqueued;
    private long failures;
    private long received;
    private InboundBulkMessage definition;
    private String status;
}
