package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity implements View.OnClickListener{
    boolean show = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Button button = findViewById(R.id.button_okay);
        button.setOnClickListener(this);

        TextView tv_test = findViewById(R.id.textView13);
        tv_test.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button_okay):
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                break;
            case (R.id.textView13):
                TextView tv_test = findViewById(R.id.textView13);
                if(!show){
                    tv_test.setText("DLLM");
                    show = true;
                } else {
                    tv_test.setText("ORIGINAL");
                    show = false;
                }
                break;
        }
    }
}
