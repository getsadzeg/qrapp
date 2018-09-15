package ge.qrapp.service;

import android.widget.Toast;

import ge.qrapp.model.SessionInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthAPI {
    private static final String BASE_URL = "https://api.fintech.ge/";
    AuthService authService;
    Toast responseToast;
    public String resp = "";

    public AuthAPI() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        authService = retrofit.create(AuthService.class);
    }

    public void auth(String username, String password) {
        authService.auth(username, password).enqueue(new Callback<SessionInfo>() {
            @Override
            public void onResponse(Call<SessionInfo> call, Response<SessionInfo> response) {
                try {
                    System.out.println(response.body().toString());
                }
                catch(Exception e) {
                    System.out.println("ERROR MESSAGE" + e.getMessage());
                    System.out.println("very much of an error");
                }
            }

            @Override
            public void onFailure(Call<SessionInfo> call, Throwable t) {
                System.out.println("ON FAILURE" + t.getMessage());
            }
        });
    }

}
