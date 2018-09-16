package ge.qrapp.util;

import ge.qrapp.model.User;

public interface CurrentUserInfo {
    void setCurrentUser(User user);
    boolean isLoggedIn();
    double getAmount();
    double setAmount();
    String getUsername();
}
