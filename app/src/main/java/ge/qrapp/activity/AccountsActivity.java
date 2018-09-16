package ge.qrapp.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ge.qrapp.R;
import ge.qrapp.adapter.AccountsAdapter;
import ge.qrapp.model.Account;
import ge.qrapp.service.AccountAPI;
import ge.qrapp.util.Statics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountsActivity extends AppCompatActivity {

    static AccountAPI accountAPI = new AccountAPI();
    public static List<Account> accounts = new ArrayList<>();
    String SessionId;
    private RecyclerView recyclerView;
    public static String amount;
    static SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        /* Intent i = getIntent();
        SessionId = i.getStringExtra("SessionId");
        System.out.println("SESS ID" + SessionId); */
        SessionId = preferences.getString("SessionId", null);
        getAccounts(SessionId);
        recyclerView = findViewById(R.id.accountsrecyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        AccountsAdapter adapter = new AccountsAdapter();
        recyclerView.setAdapter(adapter);
    }

    public void getAccounts(String SessionId) {
        accountAPI.getAccountAPIService().getAccounts(SessionId).enqueue(new Callback<List<Account>>() {
            @Override
            public void onResponse(Call<List<Account>> call, Response<List<Account>> response) {
                try {
                    if(!response.isSuccessful()) {
                        System.out.println("response failed");
                        System.out.println(response.errorBody().string());
                    }
                    else {
                        System.out.println(response.body().toString());
                        accounts = response.body();
                        System.out.println("ACCOUNTS RESPONSE " + accounts.toString());
                        String realAmount = preferences.getString("amount", "0");
                        System.out.println("FROM ACC ACT; AMOUNT IS " + realAmount);
                        accounts.get(0).getAvailableAmounts().get(0).decreaseAmount(Integer.valueOf(realAmount));
                        System.out.println("DECREASED AMOUNT: " +
                                String.valueOf(accounts.get(0).getAvailableAmounts().get(0).getAmount())
                        );
                        Statics.MockUser.getAvailableAmounts().get(0).increaseAmount(Integer.valueOf(realAmount));
                        //System.out.println("NOW AMOUNT IS " + accounts.get(0).getAvailableAmounts().get(0).getAmount());
                    }
                }
                catch(Exception e) {
                    System.out.println("EXCEPTION THROWN " + e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<List<Account>> call, Throwable t) {
                System.out.println("ON FAILURE " + t.getMessage());
            }
        });
        System.out.println("mck increased " + Statics.MockUser.getAvailableAmounts().get(0).getAmount());
    }
}
