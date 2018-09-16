package ge.qrapp.service;

import retrofit2.Retrofit;

public class AccountAPI {
    private AccountAPIService accountAPIService;

    public AccountAPI() {
        Retrofit retrofit = ServiceInitializer.init();
        setAccountAPIService(retrofit.create(AccountAPIService.class));
    }

    public AccountAPIService getAccountAPIService() {
        return accountAPIService;
    }

    public void setAccountAPIService(AccountAPIService accountAPIService) {
        this.accountAPIService = accountAPIService;
    }
}
