package ge.qrapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        /* File file = QRCode.from("Hello World").file();
        QRCode.from("Hello World").withSize(250, 250).file();
        QRCode.from("Hello World").withSize(250, 250).stream();
        System.out.println(file.getAbsolutePath() + "   PATH"); */
    }
}
