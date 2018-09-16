
package ge.qrapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;

public class MoneySubmissionActivity extends AppCompatActivity {

    EditText money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_submission);
        money = findViewById(R.id.editText);
    }

    public void generateOnClick(View view) {
        Intent intent = new Intent(MoneySubmissionActivity.this, ReceiveActivity.class);
        intent.putExtra("money", money.getText().toString());
        startActivity(intent);
    }

    public void cancelOnClick(View view) {
        startActivity(new Intent(MoneySubmissionActivity.this, MainActivity.class));
    }
}
