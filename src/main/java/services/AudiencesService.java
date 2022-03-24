package services;
import lombok.NonNull;
import models.*;

import java.io.IOException;

public class AudiencesService {
    private final AudiencesInterface audiencesInterface;

    public AudiencesService() {
        audiencesInterface = Courier.getRetrofit().create(AudiencesInterface.class);
    }

    public Audience getAudience(String audienceId) throws IOException {
        return audiencesInterface.getAudience(
                audienceId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public PutAudienceResponse putAudience(PutAudienceBody audience) throws IOException {

        return audiencesInterface.putAudience(
                audience.getId(),
                audience,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();

    }

    public AudienceMembers getAudienceMembers (String audienceId, String cursor) throws IOException {
        return audiencesInterface.getAudienceMembers(
                audienceId,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Audiences getAudiences(String cursor) throws IOException
    {
        return audiencesInterface.getAudiences(
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
