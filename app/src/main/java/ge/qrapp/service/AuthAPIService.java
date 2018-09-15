package ge.qrapp.service;

import ge.qrapp.model.SessionInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthAPIService {
    @GET("api/Clients/Login/{username}/{password}")
    Call<SessionInfo> auth(@Path("username") String username, @Path("password") String password);
}
