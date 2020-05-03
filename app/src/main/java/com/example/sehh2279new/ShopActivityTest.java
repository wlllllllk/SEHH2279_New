package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivityTest extends AppCompatActivity implements View.OnClickListener{

        private Button checkout, delete1, delete2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);

        this.setTitle("Shopping Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        checkout = findViewById(R.id.button5);
        delete1 = findViewById(R.id.delete1);
        delete2 = findViewById(R.id.delete2);

        checkout.setOnClickListener(this);
        delete1.setOnClickListener(this);
        delete2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button5:
                Intent i = new Intent(ShopActivityTest.this,payment.class);
                startActivity(i);
                break;
            case R.id.delete1:
            case R.id.delete2:
                Toast.makeText(getApplicationContext(), "Function not implemented", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}