package com.example.root.itravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Booking extends AppCompatActivity implements View.OnClickListener{
   Button bBook, bCancel, bLogout;
    EditText etTrans;
    //RadioGroup rgMain;
    //RadioButton rButton1, rButton3, rButton4;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        bBook = (Button) findViewById(R.id.bBook);
        bCancel = (Button) findViewById(R.id.bCancel);
        bLogout = (Button) findViewById(R.id.bLogout);
        etTrans = (EditText) findViewById(R.id.etTrans);
         radioGroup =(RadioGroup)findViewById(R.id.radioGroup);

        bCancel.setOnClickListener(this);
        bLogout.setOnClickListener(this);
        bBook.setOnClickListener(this);
    }

    @Override
    public void onClick(View z) {
        switch (z.getId()){
            case R.id.bCancel:
                etTrans.setText(" ");

                break;

            case R.id.bLogout:
                startActivity(new Intent(this,MainActivity.class));
                break;

            case R.id.bBook:
                System.exit(0);
        }
    }


    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton=findViewById(radioId);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Toast.makeText(this, "Selected Sacco: "+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}
