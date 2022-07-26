package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuditEvent {
    public String auditEventId;
    public String source;
    public String timestamp;
    public String type;
    public AuditEventActor actor;
    public AuditEventTarget target;
}