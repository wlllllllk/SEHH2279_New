package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShoppingRecordsActivity extends AppCompatActivity {
    private TextView tv_shoprecodrds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_records);

        this.setTitle("Shopping Records");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tv_shoprecodrds = findViewById(R.id.tv_shoprecords);

    }
}
