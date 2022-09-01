package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InboundBulkMessage extends InboundBulkMessageApiV1 {
    private InboundBulkMessageApiV2 message;
}
