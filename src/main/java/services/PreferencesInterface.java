package services;

import models.Preference;
import models.UpdateResponseBody;
import models.Preferences;
import retrofit2.Call;
import retrofit2.http.*;

public interface PreferencesInterface {
    @GET("/preferences")
    Call<Preferences> getPreferences(
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/preferences/{recipientId}")
    Call<Preference> getPreference(
            @Path("recipientId") String recipientId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/preferences/{recipientId}")
    Call<UpdateResponseBody> putPreference(
            @Path("recipientId") String recipientId,
            @Body Preference preference,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
