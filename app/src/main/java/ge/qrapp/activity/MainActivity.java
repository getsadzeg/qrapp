package ge.qrapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;
import ge.qrapp.decoder.DecoderActivity;
import ge.qrapp.service.AuthAPI;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.name);
        password = findViewById(R.id.password);
         /* Toast.makeText(this, authapi.resp, Toast.LENGTH_LONG)
                .show(); */
    }

    public void AuthOnClick(View view) {
        AuthAPI authapi = new AuthAPI();
        authapi.auth(username.getText().toString(), password.getText().toString());
        startActivity(new Intent(this, DecoderActivity.class));
    }
}
