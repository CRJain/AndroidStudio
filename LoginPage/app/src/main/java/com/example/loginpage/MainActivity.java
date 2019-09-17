package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.loginbtn);
        username = (EditText) findViewById(R.id.etuser);
        password = (EditText) findViewById(R.id.etpass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();

                if(uname.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Empty Field(s)!",
                            Toast.LENGTH_LONG).show();
                } else if(pass.equals("@123")) {
                    Intent intent = new Intent(MainActivity.this, GreetingPage.class);
                    intent.putExtra("User", uname);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,
                            "Incorrect Password!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
