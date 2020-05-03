package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ShoppingRecordsActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout order1, order2, order3, order4, order5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_records);

        this.setTitle("Shopping Records");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        order1 = (LinearLayout) findViewById(R.id.order1);
        order2 = (LinearLayout) findViewById(R.id.order2);
        order3 = (LinearLayout) findViewById(R.id.order3);
        order4 = (LinearLayout) findViewById(R.id.order4);
        order5 = (LinearLayout) findViewById(R.id.order5);

        order1.setOnClickListener(this);
        order2.setOnClickListener(this);
        order3.setOnClickListener(this);
        order4.setOnClickListener(this);
        order5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.order1:
            case R.id.order2:
            case R.id.order3:
            case R.id.order4:
            case R.id.order5:
                Intent i = new Intent (ShoppingRecordsActivity.this, ShoppingRecordsDetailsActivitty.class);
                startActivity(i);
                break;
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
