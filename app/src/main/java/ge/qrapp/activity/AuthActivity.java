package ge.qrapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;
import ge.qrapp.model.SessionInfo;
import ge.qrapp.model.UserDetails;
import ge.qrapp.service.AuthAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    public static UserDetails currentUser;
    SessionInfo sessionInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        username = findViewById(R.id.name);
        password = findViewById(R.id.password);

    }

    public void AuthOnClick(View view) {
        AuthAPI authapi = new AuthAPI();

        authapi.getAuthService().auth(username.getText().toString(), password.getText().toString()).enqueue(new Callback<SessionInfo>() {
            @Override
            public void onResponse(Call<SessionInfo> call, Response<SessionInfo> response) {
                try {
                    if(!response.isSuccessful()) System.out.println("FAILED");
                    System.out.println(response.body().toString());
                    sessionInfo = response.body();
                    //System.out.println(sessionInfo + "print 1");
                    currentUser = sessionInfo.UserDetails;

                    System.out.println(currentUser.toString() + "CURRENT USER");
                    Intent intent = new Intent(AuthActivity.this, MainActivity.class);
                    intent.putExtra("UserDetails", currentUser);
                    startActivity(intent);
                }
                catch(Exception e) {
                    System.out.println("ERROR MESSAGE" + e.getMessage());
                    System.out.println("very much of an error");
                }
            }

            @Override
            public void onFailure(Call<SessionInfo> call, Throwable t) {
                System.out.println("ON FAILURE" + t.getMessage());
            }
        });



    }

}
