package com.example.bt_mh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(v -> startActivity(new Intent(this, MenuActivity.class)));
    }
}