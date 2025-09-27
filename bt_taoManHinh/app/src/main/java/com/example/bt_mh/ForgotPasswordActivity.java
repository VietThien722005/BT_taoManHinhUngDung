package com.example.bt_mh;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(v -> {
            Toast.makeText(this, "Password reset link sent!", Toast.LENGTH_SHORT).show();
        });
    }
}