/*package com.example.sehh2279new;

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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
     /*   }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}*/
package com.example.sehh2279new;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText emailEditText;
    EditText passwordEditText;
    Button loginButton;
    TextView signUpTextView;
    ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        emailEditText = findViewById(R.id.editText3);
        passwordEditText = findViewById(R.id.editText7);
        loginButton = findViewById(R.id.button_login);
        signUpTextView = findViewById(R.id.tv_signup);
        progressBar = findViewById(R.id.progressBar3);
        mAuth = FirebaseAuth.getInstance();
        loginButton.setOnClickListener(this);
        signUpTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_signup:
                startActivity(new Intent(this,SignUpActivity.class));
                break;
            case R.id.button_login:
                loginUser();
                break;
        }
    }
    private void loginUser(){
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        if (email.isEmpty()){
            emailEditText.setError("Email is required!");
            emailEditText.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Please enter a valid email!");
            emailEditText.requestFocus();
            return;
        }
        if(password.isEmpty()){
            passwordEditText.setError("Password is required!");
            passwordEditText.requestFocus();
            return;
        }
        if(password.length()<6) {
            passwordEditText.setError("Minimum length of Password should be 6!");
            passwordEditText.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "You are Login!",
                                    Toast.LENGTH_SHORT).show();
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent intent = new Intent(getApplicationContext(),
                                    MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    task.getException().getMessage(),
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}