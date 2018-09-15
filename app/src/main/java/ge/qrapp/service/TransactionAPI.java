package ge.qrapp.service;

import ge.qrapp.util.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TransactionAPI {

    private TransactionAPIService transactionAPIService;

    public TransactionAPI() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        setTransactionAPIService(retrofit.create(TransactionAPIService.class));
    }


    public void setTransactionAPIService(TransactionAPIService transactionAPIService) {
        this.transactionAPIService = transactionAPIService;
    }

    public TransactionAPIService getTransactionAPIService() {
        return transactionAPIService;
    }
}
