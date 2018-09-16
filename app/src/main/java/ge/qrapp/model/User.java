package ge.qrapp.model;

import java.util.List;

public class User {
    public UserDetails details;
    public String password;
    public String PrintAcctNo;
    public List<AvailableAmount> availableAmounts;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "details=" + details +
                ", password='" + password + '\'' +
                ", PrintAcctNo='" + PrintAcctNo + '\'' +
                ", availableAmounts=" + availableAmounts +
                '}';
    }

    public User(UserDetails details, String password, String PrintAcctNo, List<AvailableAmount> availableAmounts) {
        this.details = details;
        this.password = password;
        this.PrintAcctNo = PrintAcctNo;
        this.availableAmounts = availableAmounts;
    }

    public UserDetails getDetails() {
        return details;
    }

    public void setDetails(UserDetails details) {
        this.details = details;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrintAcctNo() {
        return PrintAcctNo;
    }

    public void setPrintAcctNo(String printAcctNo) {
        PrintAcctNo = printAcctNo;
    }

    public List<AvailableAmount> getAvailableAmounts() {
        return availableAmounts;
    }


}
