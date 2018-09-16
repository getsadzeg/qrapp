package ge.qrapp.service;

import retrofit2.Retrofit;

public class TransactionAPI {

    private TransactionAPIService transactionAPIService;

    public TransactionAPI() {
        Retrofit retrofit = ServiceInitializer.init();
        setTransactionAPIService(retrofit.create(TransactionAPIService.class));
    }


    public void setTransactionAPIService(TransactionAPIService transactionAPIService) {
        this.transactionAPIService = transactionAPIService;
    }

    public TransactionAPIService getTransactionAPIService() {
        return transactionAPIService;
    }
}
