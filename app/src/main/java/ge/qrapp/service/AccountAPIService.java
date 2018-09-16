package ge.qrapp.service;

import java.util.List;

import ge.qrapp.model.Account;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AccountAPIService {
    @GET("api/Products/Accounts/{sessionId}")
    Call<List<Account>> getAccounts(@Path("sessionId") String SessionId);
}
