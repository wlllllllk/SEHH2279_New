package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_signup;
    Button button_login;
    TextView tv_username, tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.setTitle("Login");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tv_signup = findViewById(R.id.tv_signup);
        button_login = findViewById(R.id.button_login);
        tv_signup.setOnClickListener(this);
        button_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tv_signup:
                Intent i = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(i);
            /*case R.id.button_login:
                tv_username = findViewById(R.id.tv_drawer_username);
                tv_id = findViewById(R.id.tv_drawer_id);
                tv_username.setText("Chung Wai Chun");
                tv_id.setText("18156156A");*/
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
