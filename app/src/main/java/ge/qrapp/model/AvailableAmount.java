package ge.qrapp.model;

public class AvailableAmount {
    double Amount;
    String Currency;

    @Override
    public String toString() {
        return Amount + Currency + " ,";
    }
}
