package services;

import models.PatchRequestBody;
import models.Profile;
import models.ProfileLists;
import models.UpdateResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProfilesInterface {
    @GET("/profiles/{recipientId}")
    Call<Profile> getProfile(
            @Path("recipientId") String recipientId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @POST("/profiles/{recipientId}")
    Call<UpdateResponseBody> postProfile(
            @Path("recipientId") String recipientId,
            @Body Profile profile,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PATCH("/profiles/{recipientId}")
    Call<UpdateResponseBody> patchProfile(
            @Path("recipientId") String recipientId,
            @Body PatchRequestBody patchRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/profiles/{recipientId}")
    Call<UpdateResponseBody> putProfile(
            @Path("recipientId") String recipientId,
            @Body Profile profile,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/profiles/{recipientId}/lists")
    Call<ProfileLists> getProfileLists(
            @Path("recipientId") String recipientId,
            @Query("cursor") String cursor,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
