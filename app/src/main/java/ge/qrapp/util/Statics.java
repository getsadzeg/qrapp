package ge.qrapp.util;

import java.util.ArrayList;

import ge.qrapp.model.AvailableAmount;
import ge.qrapp.model.User;
import ge.qrapp.model.UserDetails;

public class Statics {
    static ArrayList<AvailableAmount> avamounts = new ArrayList<>();
    static {
        avamounts.add(new AvailableAmount(8, "GEL"));
        avamounts.add(new AvailableAmount(10, "USD"));
        avamounts.add(new AvailableAmount(3, "EUR"));
    }

    public static void init() {

    }

    public static User MockUser = new User(new UserDetails(
            2, "user2", "გური", "გეწაძე", "995555555555", true)
    , "asd", "GE777", avamounts);
}
