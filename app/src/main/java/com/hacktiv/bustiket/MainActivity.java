package com.hacktiv.bustiket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button SearchBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SearchBus = findViewById(R.id.search_buses);
        SearchBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity.this, Main2Activity.class);
                startNextMatchingActivity(open);
            }
        });

        Button Awal = findViewById(R.id.search_buses);
        Awal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(open);
            }
        });
    }
}

