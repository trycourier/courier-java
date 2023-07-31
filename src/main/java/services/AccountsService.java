package services;

import models.Account;
import models.AccountRequestBody;
import models.AccountsResponseBody;

import java.io.IOException;

public class AccountsService {
    private final AccountsInterface accountsInterface;

    public AccountsService() {
        accountsInterface = Courier.getRetrofit().create(AccountsInterface.class);
    }

    public Account getAccount(String accountId) throws IOException {
        return accountsInterface.getAccount(
                accountId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
                ).execute().body();
    }

    public Account updateAccount(String accountId, AccountRequestBody requestBody) throws IOException {
        return accountsInterface.updateAccount(
                accountId,
                requestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public AccountsResponseBody getAccounts(String limit, String cursor) throws IOException {
        return accountsInterface.getAccounts(
                limit,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void deleteAccount(String accountId) throws IOException {
        accountsInterface.deleteAccount(
                accountId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }
}
