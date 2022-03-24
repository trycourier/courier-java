package services;

import models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface AudiencesInterface {
        @GET("/audiences/{audienceId}")
        Call<Audience> getAudience(
                        @Path("audienceId") String audienceId,
                        @Header("Authorization") String authorization,
                        @Header("User-Agent") String userAgent);

        @PUT("/dev/audiences/{audienceId}")
        Call<PutAudienceResponse> putAudience(
                        @Path("audienceId") String audienceId,
                        @Body PutAudienceBody audience,
                        @Header("Authorization") String authorization,
                        @Header("User-Agent") String userAgent);

        @GET("/audiences/{audienceId}/members")
        Call<AudienceMembers> getAudienceMembers(
                        @Path("audienceId") String audienceId,
                        @Query("cursor") String cursor,
                        @Header("Authorization") String authorization,
                        @Header("User-Agent") String userAgent);

        @GET("/audiences")
        Call<Audiences> getAudiences(
                        @Query("cursor") String cursor,
                        @Header("Authorization") String authorization,
                        @Header("User-Agent") String userAgent);

}
