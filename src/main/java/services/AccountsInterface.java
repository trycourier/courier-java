package services;

import models.AccountRequestBody;
import models.Account;
import models.AccountsResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AccountsInterface {
    @PUT("/accounts/{accountId}")
    Call<Account> updateAccount(
            @Path("accountId") String accountId,
            @Body AccountRequestBody accountRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/accounts/{accountId}")
    Call<Account> getAccount(
            @Path("accountId") String accountId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/accounts")
    Call<AccountsResponseBody> getAccounts(
            @Query("limit") String limit,
            @Query("starting_after") String starting_after,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @DELETE("/accounts/{accountId}")
    Call<Void> deleteAccount(
            @Path("accountId") String accountId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
