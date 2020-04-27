package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ShopActivityTest extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);
        TextView quantitytext = findViewById(R.id.textView20);
        TextView pricetext = findViewById(R.id.textView25);
        Bundle extras = getIntent().getExtras();
        int value = extras.getInt("key");
        quantitytext.setText(Integer.toString(value));
        //double price = 7.7 * quantity;
        //pricetext.setText(price);
    }
}