package ge.qrapp.service;

import ge.qrapp.model.SessionInfo;
import ge.qrapp.model.UserDetails;
import ge.qrapp.util.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthAPI {
    private AuthService authService;
    SessionInfo sessionInfo;
    public static UserDetails user = null;

    public AuthAPI() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        setAuthService(retrofit.create(AuthService.class));
    }

    public AuthService getAuthService() {
        return authService;
    }

    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }
}
