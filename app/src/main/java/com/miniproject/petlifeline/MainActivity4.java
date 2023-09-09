package com.miniproject.petlifeline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText nname, nid, naddr, nphone, npass, ncpass;
    Button ngoregister;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nname = findViewById(R.id.ngoname);
        nphone = findViewById(R.id.ngophone);
        nid = findViewById(R.id.ngoid);
        naddr = findViewById(R.id.nadd);
        npass = findViewById(R.id.npass);
        ncpass = findViewById(R.id.nconpass);
        ngoregister = findViewById(R.id.register);

        ngoregister.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                final String name = nname.getText().toString();
                final String phone = nphone.getText().toString();
                final String id = nid.getText().toString();
                final String addr = naddr.getText().toString();
                final String pass = npass.getText().toString();
                final String cpass = ncpass.getText().toString();

                if (name.length() == 0 && phone.length() == 0 && id.length() == 0 && addr.length() == 0 && pass.length() == 0 && cpass.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter valid Credentials", Toast.LENGTH_SHORT).show();
                } else if (name.length()==0) {
                    nname.requestFocus();
                    nname.setError("Enter Name");
                } else if (phone.length()==0) {
                    nphone.requestFocus();
                    nphone.setError("Enter Phone No.");
                } else if(id.length()==0){
                    nid.requestFocus();
                    nid.setError("Enter ID");
                } else if(addr.length()==0){
                    naddr.requestFocus();
                    naddr.setError("Enter Address");
                } else if(pass.length()==0){
                    npass.requestFocus();
                    npass.setError("Enter Password");
                } else if(cpass.length()==0){
                    ncpass.requestFocus();
                    ncpass.setError("Confirm Password");
                } else {
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