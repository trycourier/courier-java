package services;

import models.Preference;
import models.UpdateResponseBody;
import models.Preferences;

import java.io.IOException;

public class PreferencesService {
    private final PreferencesInterface preferencesInterface;

    public PreferencesService() {
        preferencesInterface = Courier.getRetrofit().create(PreferencesInterface.class);
    }

    public Preferences getPreferences(
    ) throws IOException {
        return preferencesInterface.getPreferences(
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Preference getPreference(
            String recipientId
    ) throws IOException {
        return preferencesInterface.getPreference(
                recipientId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public UpdateResponseBody putPreference(
            String recipientId,
            Preference preference
    ) throws IOException {
        return preferencesInterface.putPreference(
                recipientId,
                preference,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
