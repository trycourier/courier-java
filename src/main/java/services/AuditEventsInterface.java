package services;

import models.AuditEvent;
import models.AuditEvents;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AuditEventsInterface {
    @GET("/audit-events/{auditEventId}")
    Call<AuditEvent> getAuditEvent(
            @Path("auditEventId") String auditEventId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent);

    @GET("/audit-events")
    Call<AuditEvents> listAuditEvents(
            @Query("cursor") String cursor,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent);
}
