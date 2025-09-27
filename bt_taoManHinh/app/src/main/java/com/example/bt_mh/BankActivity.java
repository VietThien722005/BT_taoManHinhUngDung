package com.example.bt_mh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class BankActivity extends AppCompatActivity {
    Button btnBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        btnBank = findViewById(R.id.btnBank);
        btnBank.setOnClickListener(v -> startActivity(new Intent(this, BankLoginActivity.class)));
    }
}