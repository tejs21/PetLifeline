package com.miniproject.petlifeline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText fullname,phoneno,address,petname,petlicence,password,confpass;
    Button userregister;
    RadioGroup rpet;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fullname = findViewById(R.id.fname);
        phoneno = findViewById(R.id.phone);
        address = findViewById(R.id.add);
        petname = findViewById(R.id.pname);
        petlicence = findViewById(R.id.petlic);
        password = findViewById(R.id.upass);
        confpass = findViewById(R.id.conpass);
        rpet = findViewById(R.id.pet);
        userregister = findViewById(R.id.register);

        userregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = fullname.getText().toString();
                final String phone = phoneno.getText().toString();
                final String addr = address.getText().toString();
                final String petn = petname.getText().toString();
                final String petl = petlicence.getText().toString();
                final String pass = password.getText().toString();
                final String cpass = confpass.getText().toString();

                if (name.length() == 0 && phone.length() == 0 && addr.length() == 0 && petn.length() == 0 && petl.length() == 0 && pass.length() == 0 && cpass.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter valid Credentials", Toast.LENGTH_SHORT).show();
                } else if (name.length()==0) {
                    fullname.requestFocus();
                    fullname.setError("Enter Name");
                } else if (phone.length()==0) {
                    phoneno.requestFocus();
                    phoneno.setError("Enter Phone No.");
                } else if (addr.length()==0) {
                    address.requestFocus();
                    address.setError("Enter Address");
                } else if (rpet.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(),"Select Pet",Toast.LENGTH_SHORT).show();
                }else if (petn.length()==0) {
                    petname.requestFocus();
                    petname.setError("Enter Pet Name");
                } else if (petl.length()==0) {
                    petlicence.requestFocus();
                    petlicence.setError("Enter Pet Licence No.");
                } else if (pass.length()==0) {
                    password.requestFocus();
                    password.setError("Enter Password");
                } else if (cpass.length()==0) {
                    confpass.requestFocus();
                    confpass.setError("Confirm Password");
                }  else {
                    registerme();
                }
            }
        });
    }
    public void registerme(){
        Intent intent = new Intent(this,homepage.class);
        startActivity(intent);
    }

}