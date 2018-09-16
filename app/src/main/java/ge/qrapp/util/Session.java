package ge.qrapp.util;

import ge.qrapp.model.User;

public class Session implements CurrentUserInfo {

    public static User user;

    @Override
    public void setCurrentUser(User user) {
        this.user = user;
    }

    public User getCurrentUser() {
        return user;
    }

    @Override
    public boolean isLoggedIn() {
        return user!=null;
    }

    @Override
    public double getAmount() {
        return user.availableAmounts.get(0).getAmount();
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user.toString() +
                '}';
    }

    @Override
    public double setAmount() {
        return 0;
    }

    @Override
    public String getUsername() {
        return null;
    }
}
