package com.hacktiv.bustiket;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {
    Button Awal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Button Awal = findViewById(R.id.btn_1);
        Awal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(open);
            }
        });
        Awal = findViewById(R.id.btn_2);
        Awal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(SplashScreen.this, RegisterActivity.class);
                startActivity(open);
            }
        });
    }

}