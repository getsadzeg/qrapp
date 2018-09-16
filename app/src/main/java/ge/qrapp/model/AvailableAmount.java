package ge.qrapp.model;

public class AvailableAmount {
    double Amount;
    String Currency;

    public AvailableAmount(double amount, String currency) {
        Amount = amount;
        Currency = currency;
    }

    public double getAmount() {
        return Amount;
    }

    public void increaseAmount(double Amount) {
        this.Amount+=Amount;
    }

    public void decreaseAmount(double Amount) {
        this.Amount-=Amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    @Override
    public String toString() {
        return Amount + Currency + " ,";
    }
}
