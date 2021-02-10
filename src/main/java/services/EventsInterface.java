package services;

import models.Event;
import models.Events;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.PUT;

public interface EventsInterface {
    @GET("/events")
    Call<Events> getEvents(
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/events/{eventId}")
    Call<Event> getEvent(
            @Path("eventId") String eventId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/events/{eventId}")
    Call<Event> putEvent(
            @Path("eventId") String eventId,
            @Body Event event,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
