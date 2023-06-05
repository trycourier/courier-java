package services;

import models.CreateAuthTokenRequestBody;
import models.CreateAuthTokenResponseBody;

import java.io.IOException;

public class AuthTokenService {
    private final AuthTokenInterface authTokenInterface;

    public AuthTokenService() {
        authTokenInterface = Courier.getRetrofit().create(AuthTokenInterface.class);
    }

    public CreateAuthTokenResponseBody createToken(CreateAuthTokenRequestBody requestBody) throws IOException {
        return authTokenInterface.createAuthToken(
                requestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
