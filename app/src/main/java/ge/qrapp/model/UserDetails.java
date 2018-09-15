package ge.qrapp.model;

public class UserDetails {
    public int UserId;
    public String Username;
    public String Name;
    public String LastName;
    public String PhoneForSms;
    public boolean Active;

    @Override
    public String toString() {
        return "UserDetails{" +
                "UserId=" + UserId +
                ", Username='" + Username + '\'' +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", PhoneForSms='" + PhoneForSms + '\'' +
                ", Active=" + Active +
                '}';
    }
}
