package ge.qrapp.service;

import ge.qrapp.model.UserDetails;
import ge.qrapp.util.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthAPI {
    private AuthAPIService authAPIService;
    public static UserDetails user = null;

    public AuthAPI() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        setAuthAPIService(retrofit.create(AuthAPIService.class));
    }

    public AuthAPIService getAuthAPIService() {
        return authAPIService;
    }

    public void setAuthAPIService(AuthAPIService authAPIService) {
        this.authAPIService = authAPIService;
    }
}
