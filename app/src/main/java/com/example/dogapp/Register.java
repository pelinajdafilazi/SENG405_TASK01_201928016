package com.example.dogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    EditText Email,Pass;
    Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_tab_fragment);


        Email = findViewById(R.id.Email);
        Pass = findViewById(R.id.pass);
        Reg = findViewById(R.id.Reg);


        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mail,passw;

                Mail = Email.getText().toString();
                passw = Pass.getText().toString();

                if(Mail.equals(""));{
                    Toast.makeText(Register.this, "Email is Blank", Toast.LENGTH_SHORT).show();
                }

                if(passw.equals(""));{
                    Toast.makeText(Register.this, "Password is Blank", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}