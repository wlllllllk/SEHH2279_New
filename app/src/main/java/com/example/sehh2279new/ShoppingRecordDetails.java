package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShoppingRecordDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_record_details);

        this.setTitle("Order Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
