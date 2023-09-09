package com.miniproject.petlifeline;

import static com.miniproject.petlifeline.R.id.userbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button user,ngo,doctor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        user = findViewById(R.id.userbtn);
        ngo = findViewById(R.id.ngobtn);
        doctor = findViewById(R.id.docbtn);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuser();
            }
        });

        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendoctor();
            }
        });

        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openngo();
            }
        });
    }
    public void openuser(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openngo(){
        Intent intent2 = new Intent(this, MainActivity4.class);
        startActivity(intent2);
    }

    public void opendoctor(){
        Intent intent3 = new Intent(this, MainActivity5.class);
        startActivity(intent3);
    }
}