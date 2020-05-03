package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class ShopActivityTest extends AppCompatActivity implements View.OnClickListener{
        private int value;
        private double price;
        private double totalprice;
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


        /*TextView quantitytext = findViewById(R.id.textView20);
        TextView pricetext = findViewById(R.id.textView25);
        TextView total = findViewById(R.id.textView91);

        Button delete = findViewById(R.id.button7);
        Bundle extras = getIntent().getExtras();
        value = extras.getInt("key");
        quantitytext.setText(Integer.toString(value));
        price = 7.7 * value;
        pricetext.setText("$ "+Double.toString(price));
        totalprice = price+26.1;
        total.setText("$ "+Double.toString(totalprice));*/

        /*delete.setOnClickListener(new View.OnClickListener(){
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
        });*/
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