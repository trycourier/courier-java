package services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Base64;

public class Courier {
    private static String baseUrl = "https://api.courier.com/";
    private static String authToken;
    private static String username;
    private static String password;
    private static String authorizationHeader;
    private static Retrofit retrofit;
    private static String version = "1.0.0";

    private Courier() {
    }

    public static synchronized void init() {
        init(null, null, null, null);
    }

    public static synchronized void init(String authToken) {
        init(null, authToken, null, null);
    }

    public static synchronized void init(String baseUrl, String authToken) {
        init(baseUrl, authToken, null, null);
    }

    public static synchronized void init(
            final String baseUrl,
            final String authToken,
            final String username,
            final String password
    ) {
        // Override baseUrl if passed as a param or set as an environment variable
        if (baseUrl != null) {
            Courier.baseUrl = baseUrl;
        } else if (System.getenv("COURIER_BASE_URL") != null) {
            Courier.baseUrl = System.getenv("COURIER_BASE_URL");
        }

        // Token Auth takes precedence; If no token auth, then Basic Auth
        if (authToken != null) {
            Courier.authToken = authToken;
            Courier.authorizationHeader = "Bearer " + authToken;
        } else if (System.getenv("COURIER_AUTH_TOKEN") != null) {
            Courier.authToken = System.getenv("COURIER_AUTH_TOKEN");
            Courier.authorizationHeader = "Bearer " + System.getenv("COURIER_AUTH_TOKEN");
        } else if (username != null && password != null) {
            Courier.username = username;
            Courier.password = password;
            Courier.authorizationHeader = "Basic " + Base64.getEncoder()
                    .encodeToString((username + ":" + password).getBytes());
        } else if (System.getenv("COURIER_AUTH_USERNAME") != null
                && System.getenv("COURIER_AUTH_PASSWORD") != null) {
            Courier.username = System.getenv("COURIER_AUTH_USERNAME");
            Courier.password = System.getenv("COURIER_AUTH_PASSWORD");
            Courier.authorizationHeader = "Basic " + Base64.getEncoder()
                    .encodeToString(
                            (System.getenv("COURIER_AUTH_USERNAME") +
                                    ":" + System.getenv("COURIER_AUTH_PASSWORD"))
                                    .getBytes());
        }

        Courier.retrofit = buildRetrofit();
    }

    public static String getBaseUrl() {
        return Courier.baseUrl;
    }

    public static String getAuthorizationHeader() {
        return Courier.authorizationHeader;
    }

    public static Retrofit getRetrofit() {
        if (Courier.retrofit != null) {
            synchronized (Courier.class) {
                if (Courier.retrofit == null) {
                    Courier.retrofit = buildRetrofit();
                }
            }
        }
        return Courier.retrofit;
    }

    private static Retrofit buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Courier.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static String getUserAgent() {
        return "courier-java/" + Courier.version;
    }
}
