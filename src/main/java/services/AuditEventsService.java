package services;

import models.AuditEvent;
import models.AuditEvents;

import java.io.IOException;

public class AuditEventsService {
    private final AuditEventsInterface auditEventsInterface;

    public AuditEventsService() {
        auditEventsInterface = Courier.getRetrofit().create(AuditEventsInterface.class);
    }

    public AuditEvent getAuditEvent(String auditEventId) throws IOException {
        return auditEventsInterface.getAuditEvent(
                auditEventId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public AuditEvents listAuditEvents(String cursor) throws IOException
    {
        return auditEventsInterface.listAuditEvents(
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
