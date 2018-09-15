package ge.qrapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;

public class PaymentActivity extends AppCompatActivity {

    TextView howMuch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        howMuch = findViewById(R.id.howmuch);

        Intent paymentIntent = getIntent();
        String text = paymentIntent.getStringExtra("qr");
        howMuch.append(" " + text);
    }
}
