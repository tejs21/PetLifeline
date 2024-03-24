package com.miniproject.petlifeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText fullname, phoneno, address, petname, petlicence, password, confpass;
    Button userregister;

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
        userregister = findViewById(R.id.register);

        userregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = fullname.getText().toString();
                String phone = phoneno.getText().toString();
                String addr = address.getText().toString();
                String petn = petname.getText().toString();
                String petl = petlicence.getText().toString();
                String pass = password.getText().toString();
                String cpass = confpass.getText().toString();

                if (name.length() == 0 && phone.length() == 0 && addr.length() == 0 && petn.length() == 0 && petl.length() == 0 && pass.length() == 0 && cpass.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter valid Credentials", Toast.LENGTH_SHORT).show();
                } else if (name.length() == 0) {
                    fullname.requestFocus();
                    fullname.setError("Enter Name");
                } else if (phone.length() == 0) {
                    phoneno.requestFocus();
                    phoneno.setError("Enter Phone No.");
                } else if (addr.length() == 0) {
                    address.requestFocus();
                    address.setError("Enter Address");
                } else if (petn.length() == 0) {
                    petname.requestFocus();
                    petname.setError("Enter Pet Name");
                } else if (petl.length() == 0) {
                    petlicence.requestFocus();
                    petlicence.setError("Enter Pet Licence No.");
                } else if (pass.length() == 0) {
                    password.requestFocus();
                    password.setError("Enter Password");
                } else if (cpass.length() == 0) {
                    confpass.requestFocus();
                    confpass.setError("Confirm Password");
                } else {
                    registerme();
                }
            }

            public void registerme() {
                Toast.makeText(getApplicationContext(), "Registration Successfull", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}