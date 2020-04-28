package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ShopActivityTest extends AppCompatActivity {
        private int value;
        private double price;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);
        TextView quantitytext = findViewById(R.id.textView20);
        TextView pricetext = findViewById(R.id.textView25);
        Button checkout = findViewById(R.id.button5);
        Button delete = findViewById(R.id.button7);
        Bundle extras = getIntent().getExtras();
        value = extras.getInt("key");
        quantitytext.setText(Integer.toString(value));
        price = 7.7 * value;
        pricetext.setText(Double.toString(price));
        checkout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(ShopActivityTest.this,payment.class);
                i.putExtra("key1",Integer.toString(value));
                i.putExtra("key2",Double.toString(price));
                startActivity(i);

            }
        });
        delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ImageView apple = findViewById(R.id.imageView2);
                View divider = findViewById(R.id.divider2);
                TextView x = findViewById(R.id.textView9);
                TextView y = findViewById(R.id.textView10);
                TextView z = findViewById(R.id.textView12);
                TextView quantitytext = findViewById(R.id.textView20);
                TextView pricetext = findViewById(R.id.textView25);
                Button checkout = findViewById(R.id.button5);
                Button delete = findViewById(R.id.button7);
                checkout.setEnabled(false);
                delete.setVisibility(View.GONE);
                quantitytext.setVisibility(View.GONE);
                pricetext.setVisibility(View.GONE);
                apple.setVisibility(View.GONE);
                x.setVisibility(View.GONE);
                y.setVisibility(View.GONE);
                z.setVisibility(View.GONE);
                divider.setVisibility(View.GONE);

            }
        });
    }
}