package ge.qrapp.service;

import ge.qrapp.model.TransactionsSummary;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TransactionAPIService {
    @GET("api/Products/Transactions/{sessionId}")
    Call<TransactionsSummary> getTransactions(@Path("sessionId") String SessionId);
}
