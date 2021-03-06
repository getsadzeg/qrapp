package ge.qrapp.activity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;
import net.glxn.qrgen.core.image.ImageType;

import java.io.File;

import androidx.appcompat.app.AppCompatActivity;
import ge.qrapp.R;
import ge.qrapp.util.Statics;

public class ReceiveActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        imageView = findViewById(R.id.imageview);
        Intent intent = getIntent();
        String money = intent.getStringExtra("money");
        String qrtext = money + "-" + Statics.MockUser.getPrintAcctNo();
        File file = QRCode.from(qrtext).to(ImageType.JPG).file();
        System.out.println("PATH " + file.getAbsolutePath());
        imageView.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
    }
}
