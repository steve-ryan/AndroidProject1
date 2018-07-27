package com.example.root.itravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity implements View.OnClickListener {


    Button bCancel, bSubmit;
    EditText etName, etPassword, etPassword3, etEmail2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword3 = (EditText) findViewById(R.id.etPassword3);
        etEmail2 = (EditText) findViewById(R.id.etEmail2);
        bCancel = (Button) findViewById(R.id.bCancel);
        bSubmit = (Button) findViewById(R.id.bSubmit);

        bSubmit.setOnClickListener(this);
        bCancel.setOnClickListener(this);
    }


    @Override
    public void onClick(View y) {
        switch (y.getId()){
            case R.id.bSubmit:
                if (etPassword.getText().toString().equals(etPassword3.getText().toString())) {

                    startActivity(new Intent(this, MainActivity.class));
                }else{
                    Toast.makeText(this,"confirmation password does not match password",Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.bCancel:
                etPassword3.setText(" ");
                etPassword.setText(" ");
                etEmail2.setText(" ");
                etName.setText(" ");

        }
    }
}
