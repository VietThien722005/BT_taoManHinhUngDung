package com.example.bt_mh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class BankLoginActivity extends AppCompatActivity {
    Button btnBankLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_login);

        btnBankLogin = findViewById(R.id.btnBankLogin);
        btnBankLogin.setOnClickListener(v -> startActivity(new Intent(this, ConfirmActivity.class)));
    }
}