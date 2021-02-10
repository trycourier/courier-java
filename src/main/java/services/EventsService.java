package services;

import models.Event;
import models.Events;

import java.io.IOException;

public class EventsService {
    private final EventsInterface eventsInterface;

    public EventsService() {
        eventsInterface = Courier.getRetrofit().create(EventsInterface.class);
    }

    public Events getEvents(
    ) throws IOException {
        return eventsInterface.getEvents(
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Event getEvent(
            String eventId
    ) throws IOException {
        return eventsInterface.getEvent(
                eventId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Event putEvent(
            String eventId,
            Event event
    ) throws IOException {
        return eventsInterface.putEvent(
                eventId,
                event,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
