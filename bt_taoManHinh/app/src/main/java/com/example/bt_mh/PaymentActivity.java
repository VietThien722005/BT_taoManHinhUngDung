package com.example.bt_mh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {
    Button btnMobile, btnInternet, btnQr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btnMobile = findViewById(R.id.btnMobile);
        btnInternet = findViewById(R.id.btnInternet);
        btnQr = findViewById(R.id.btnQr);

        btnMobile.setOnClickListener(v -> startActivity(new Intent(this, BankActivity.class)));
        btnInternet.setOnClickListener(v -> startActivity(new Intent(this, BankActivity.class)));
        btnQr.setOnClickListener(v -> startActivity(new Intent(this, BankActivity.class)));
    }
}