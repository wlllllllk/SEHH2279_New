package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailsActivity extends AppCompatActivity implements View.OnClickListener{

    int amount = 1;
    TextView tv_amount, tv_view_reviews, tv_view_related;
    LinearLayout related1, related2, related3, related4, related5, related6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        this.setTitle("Product Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_amount = (TextView) findViewById(R.id.tv_amount);
        tv_amount.setText(String.valueOf(amount));

        tv_view_reviews = (TextView) findViewById(R.id.tv_reviews_view_all);
        tv_view_related = (TextView) findViewById(R.id.tv_related_view_all);

        tv_view_reviews.setOnClickListener(this);
        tv_view_related.setOnClickListener(this);

        related1 = findViewById(R.id.related1);
        related2 = findViewById(R.id.related2);
        related3 = findViewById(R.id.related3);
        related4 = findViewById(R.id.related4);
        related5 = findViewById(R.id.related5);
        related6 = findViewById(R.id.related6);
        related1.setOnClickListener(this);
        related2.setOnClickListener(this);
        related3.setOnClickListener(this);
        related4.setOnClickListener(this);
        related5.setOnClickListener(this);
        related6.setOnClickListener(this);

        Button button_minus = (Button) findViewById(R.id.button_minus);
        Button button_add = (Button) findViewById(R.id.button_add);
        Button button_add_to_cart = (Button) findViewById(R.id.button_add_to_cart);

        button_minus.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_add_to_cart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case (R.id.button_minus):
                if(amount > 1)
                    amount -= 1;
                tv_amount.setText(String.valueOf(amount));
                break;
            case (R.id.button_add):
                amount += 1;
                tv_amount.setText(String.valueOf(amount));
                break;
            case (R.id.button_add_to_cart):
                Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
                Intent i = new Intent (ProductDetailsActivity.this, ShopActivityTest.class);
                //i.putExtra("key",amount);
                startActivity(i);
                break;
            case (R.id.tv_reviews_view_all):
                Intent i2 = new Intent (ProductDetailsActivity.this, ReviewsActivity.class);
                startActivity(i2);
                break;
            case (R.id.tv_related_view_all):
                Toast.makeText(getApplicationContext(), "Function not implemented", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.related1):
            case (R.id.related2):
            case (R.id.related3):
            case (R.id.related4):
            case (R.id.related5):
            case (R.id.related6):
                Intent i3 = new Intent (ProductDetailsActivity.this, ProductDetails2Activity.class);
                startActivity(i3);
                break;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
