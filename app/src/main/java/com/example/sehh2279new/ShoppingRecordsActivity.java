package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShoppingRecordsActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_records);

        this.setTitle("Shopping Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnbutton();
    }


    public void addListenerOnbutton(){
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingRecordsActivity.this, ShoppingRecordDetails.class);
                startActivity(intent);
            }
        });
    }
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
