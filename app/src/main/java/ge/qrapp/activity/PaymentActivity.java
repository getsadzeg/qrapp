package ge.qrapp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;
import ge.qrapp.util.Statics;

public class PaymentActivity extends AppCompatActivity {

    TextView howMuch;
    String amount;
    String acctNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        howMuch = findViewById(R.id.howmuch);

        Intent paymentIntent = getIntent();
        String text = paymentIntent.getStringExtra("qrdata");
        amount = text.subSequence(0, text.lastIndexOf('-')).toString();
        acctNo = text.subSequence(text.lastIndexOf('-'), text.length()-1).toString();

        howMuch.append(" " + amount);
        //5GEL-GE777
    }

    public void payOnClick(View view) {
        String realAmount = amount.subSequence(0, amount.length()-3).toString();
        //System.out.println("AMOUNT IS " + realAmount);
        Statics.MockUser.availableAmounts.get(0).increaseAmount(Integer.valueOf(realAmount));
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("amount", realAmount);
        editor.apply();
        startActivity(new Intent(PaymentActivity.this, AccountsActivity.class));
       /*
        Session.user.updateAmount(Integer.valueOf(realAmount));
        Toast.makeText(this, "mock user updated: " + Statics.MockUser.getAvailableAmounts().get(0).getAmount(),
                Toast.LENGTH_LONG).show();
        Toast.makeText(this, "current user updated: " + Session.user.getAvailableAmounts().
                get(0).getAmount(), Toast.LENGTH_LONG).show(); */
    }
}
