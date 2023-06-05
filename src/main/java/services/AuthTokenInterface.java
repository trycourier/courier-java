package services;

import models.CreateAuthTokenRequestBody;
import models.CreateAuthTokenResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthTokenInterface {
    @POST("/auth/issue-token")
    Call<CreateAuthTokenResponseBody> createAuthToken(
            @Body CreateAuthTokenRequestBody authTokenBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
