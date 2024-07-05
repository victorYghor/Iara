package com.iara.UseFulPhones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.iara.R;

public class UseFulPhonesActivity extends AppCompatActivity {

    private Button defesaCivilButton;
    private Button bombeirosButton;
    private Button policiaMilitarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_use_ful_phones);

        Button defesaCivilButton = findViewById(R.id.defesaCivilButton);
        Button bombeirosButton = findViewById(R.id.bombeirosButton);
        Button policiaMilitarButton = findViewById(R.id.policiaMilitarButton);

        defesaCivilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber("199");
            }
        });

        bombeirosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber("193");
            }
        });

        policiaMilitarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber("190");
            }
        });
    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}