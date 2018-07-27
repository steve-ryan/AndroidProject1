package com.example.root.itravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class   MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etEmail, etPassword;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegister = (TextView) findViewById(R.id.tvRegister);

        bLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View w) {
        String password = etPassword.getText().toString();
        String email = etEmail.getText().toString();
        if (password.equals("password") && email.equals("app@gmail.com")) {
            Toast.makeText(this, "You've successfully logined In", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Booking.class));
        } else {

            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }

        switch (w.getId()) {
            case R.id.tvRegister:
                startActivity(new Intent(this, Register.class));
                break;

        }
    }
}