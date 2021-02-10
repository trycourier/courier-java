package services;

import models.PatchRequestBody;
import models.Profile;
import models.ProfileLists;
import models.UpdateResponseBody;

import java.io.IOException;

public class ProfilesService {
    private final ProfilesInterface profilesInterface;

    public ProfilesService() {
        profilesInterface = Courier.getRetrofit().create(ProfilesInterface.class);
    }

    public Profile getProfile(
            String recipientId
    ) throws IOException {
        return profilesInterface.getProfile(
                recipientId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public UpdateResponseBody postProfile(
            String recipientId,
            Profile profile
    ) throws IOException {
        return profilesInterface.postProfile(
                recipientId,
                profile,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public UpdateResponseBody patchProfile(
            String recipientId,
            PatchRequestBody patchRequestBody
    ) throws IOException {
        return profilesInterface.patchProfile(
                recipientId,
                patchRequestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public UpdateResponseBody putProfile(
            String recipientId,
            Profile profile
    ) throws IOException {
        return profilesInterface.putProfile(
                recipientId,
                profile,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public ProfileLists getProfileLists(
            String recipientId,
            String cursor
    ) throws IOException {
        return profilesInterface.getProfileLists(
                recipientId,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
