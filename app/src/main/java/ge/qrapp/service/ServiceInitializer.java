package ge.qrapp.service;

import ge.qrapp.util.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceInitializer {
    public static Retrofit init() {
        return new Retrofit.Builder().baseUrl(Constants.BASE_URL).
                addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
