package ge.qrapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import ge.qrapp.R;
import ge.qrapp.model.UserDetails;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    TextView header;
    UserDetails currentUser;
    String fullName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();

        UserDetails user = (UserDetails) i.getSerializableExtra("UserDetails");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);
        header = navView.getHeaderView(0).findViewById(R.id.nav_header);
        header.setText(user.Name + " " + user.LastName);
        navView.bringToFront();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.receivepayment:
                startActivity(new Intent(MainActivity.this, ReceiveActivity.class));
                break;
            case R.id.sendpayment:
                startActivity(new Intent(MainActivity.this, DecoderActivity.class));
                break;
        }
        drawer.closeDrawers();
        return true;
    }
}
