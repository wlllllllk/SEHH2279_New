package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailsActivity extends AppCompatActivity implements View.OnClickListener{

    int amount = 1;
    TextView tv_amount, tv_view_reviews, tv_view_related;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        this.setTitle("Product Details");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tv_amount = (TextView) findViewById(R.id.tv_amount);
        tv_amount.setText(String.valueOf(amount));

        tv_view_reviews = (TextView) findViewById(R.id.tv_reviews_view_all);
        tv_view_related = (TextView) findViewById(R.id.tv_related_view_all);

        tv_view_reviews.setOnClickListener(this);
        tv_view_related.setOnClickListener(this);

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
                i.putExtra("key",amount);
                startActivity(i);
                break;
            case (R.id.tv_reviews_view_all):
                Intent i2 = new Intent (ProductDetailsActivity.this, ReviewsActivity.class);
                startActivity(i2);
                break;
            case (R.id.tv_related_view_all):
                Toast.makeText(getApplicationContext(), "View all related products", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
