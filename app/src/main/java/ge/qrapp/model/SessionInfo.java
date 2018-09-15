package ge.qrapp.model;

public class SessionInfo {
    public String SessionId;
    public SessionDetails SessionDetails;
    public UserDetails UserDetails;

    @Override
    public String toString() {
        return "SessionInfo{" +
                "SessionId='" + SessionId + '\'' +
                ", SessionDetails=" + SessionDetails +
                ", UserDetails=" + UserDetails +
                '}';
    }
}
