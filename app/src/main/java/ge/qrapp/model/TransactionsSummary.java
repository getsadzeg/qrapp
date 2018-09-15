package ge.qrapp.model;

import java.util.Collection;

public class TransactionsSummary {
    double OutcomeSum;
    double IncomeSum;
    Collection<Transaction> MyOperations;

    @Override
    public String toString() {
        return "TransactionsSummary{" +
                "OutcomeSum=" + OutcomeSum +
                ", IncomeSum=" + IncomeSum +
                ", MyOperations=" + MyOperations +
                '}';
    }
}
