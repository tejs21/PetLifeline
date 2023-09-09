package com.miniproject.petlifeline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    EditText dname,dphone,did,daddr,dqual,dpass,dcpass;
    Button docregister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        dname=findViewById(R.id.docname);
        dphone=findViewById(R.id.docphone);
        did=findViewById(R.id.docid);
        daddr=findViewById(R.id.docadd);
        dqual=findViewById(R.id.docqual);
        dpass=findViewById(R.id.docpass);
        dcpass=findViewById(R.id.doccpass);
        docregister=findViewById(R.id.register);

        docregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = dname.getText().toString();
                final String phone = dphone.getText().toString();
                final String id = did.getText().toString();
                final String addr = daddr.getText().toString();
                final String qual = dqual.getText().toString();
                final String pass = dpass.getText().toString();
                final String cpass = dcpass.getText().toString();

                if (name.length() == 0 && phone.length() == 0 && id.length() == 0 && addr.length() == 0 && qual.length() == 0 && pass.length() == 0 && cpass.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter valid Credentials", Toast.LENGTH_SHORT).show();
                } else if(dname.length()==0){
                    dname.requestFocus();
                    dname.setError("Enter Name");
                } else if(dphone.length()==0) {
                    dphone.requestFocus();
                    dphone.setError("Enter Phone No.");
                } else if(did.length()==0) {
                    did.requestFocus();
                    did.setError("Enter ID");
                } else if(daddr.length()==0){
                    daddr.requestFocus();
                    daddr.setError("Enter Address");
                } else if(dqual.length()==0) {
                    dqual.requestFocus();
                    dqual.setError("Enter Qualification");
                } else if(dpass.length()==0) {
                    dpass.requestFocus();
                    dpass.setError("Enter Password");
                } else if(dcpass.length()==0) {
                    dcpass.requestFocus();
                    dcpass.setError("Confirm Password");
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