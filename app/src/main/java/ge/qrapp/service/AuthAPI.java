package ge.qrapp.service;

import ge.qrapp.model.UserDetails;
import retrofit2.Retrofit;

public class AuthAPI {
    private AuthAPIService authAPIService;
    public static UserDetails user = null;

    public AuthAPI() {
        Retrofit retrofit = ServiceInitializer.init();
        setAuthAPIService(retrofit.create(AuthAPIService.class));
    }

    public AuthAPIService getAuthAPIService() {
        return authAPIService;
    }

    public void setAuthAPIService(AuthAPIService authAPIService) {
        this.authAPIService = authAPIService;
    }
}
