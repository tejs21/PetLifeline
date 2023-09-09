package com.miniproject.petlifeline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView register;
    EditText user, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.registertext);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Name=user.getText().toString();
                final String passw=pass.getText().toString();

                if(Name.length()==0 && passw.length()==0)
                {
                    user.setError("Enter valid Username");
                    pass.setError("Enter valid Password");
                    Toast.makeText(getApplicationContext(),"Enter valid Credentials",Toast.LENGTH_SHORT).show();
                } else if (Name.length()==0) {
                    user.requestFocus();
                    user.setError("Enter valid Username");
                } else if (passw.length()==0) {
                    pass.requestFocus();
                    pass.setError("Enter valid Password");
                } else {
                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();
                    loginme();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewactivity();
            }
        });
    }

    public void loginme(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
    public void opennewactivity(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}