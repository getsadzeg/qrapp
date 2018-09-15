package ge.qrapp.model;

import java.util.List;

public class TransactionsSummary {
    public double OutcomeSum;
    public double IncomeSum;
    public List<Transaction> MyOperations;

    @Override
    public String toString() {
        return "TransactionsSummary{" +
                "OutcomeSum=" + OutcomeSum +
                ", IncomeSum=" + IncomeSum +
                ", MyOperations=" + MyOperations +
                '}';
    }
}
