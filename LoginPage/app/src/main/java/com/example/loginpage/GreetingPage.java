package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GreetingPage extends AppCompatActivity {

    private TextView dispUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting_page);

        dispUser = (TextView) findViewById(R.id.textView2);

        String greet = "Welcome " + getIntent().getStringExtra("User") + "!";
        dispUser.setText(greet);
    }
}
