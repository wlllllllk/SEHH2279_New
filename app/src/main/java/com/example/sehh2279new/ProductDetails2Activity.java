package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetails2Activity extends AppCompatActivity implements View.OnClickListener{

    int amount = 1;
    TextView tv_amount1, tv_view_reviews, tv_view_related;
    LinearLayout related11, related12, related13, related14, related15, related16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details2);

        this.setTitle("Product Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_amount1 = (TextView) findViewById(R.id.tv_amount1);
        tv_amount1.setText(String.valueOf(amount));

        tv_view_reviews = (TextView) findViewById(R.id.tv_reviews_view_all);
        tv_view_related = (TextView) findViewById(R.id.tv_related_view_all);

        tv_view_reviews.setOnClickListener(this);
        tv_view_related.setOnClickListener(this);

        related11 = findViewById(R.id.related11);
        related12 = findViewById(R.id.related12);
        related13 = findViewById(R.id.related13);
        related14 = findViewById(R.id.related14);
        related15 = findViewById(R.id.related15);
        related16 = findViewById(R.id.related16);
        related11.setOnClickListener(this);
        related12.setOnClickListener(this);
        related13.setOnClickListener(this);
        related14.setOnClickListener(this);
        related15.setOnClickListener(this);
        related16.setOnClickListener(this);

        Button button_minus1 = (Button) findViewById(R.id.button_minus1);
        Button button_add1 = (Button) findViewById(R.id.button_add1);
        Button button_add_to_cart1 = (Button) findViewById(R.id.button_add_to_cart1);

        button_minus1.setOnClickListener(this);
        button_add1.setOnClickListener(this);
        button_add_to_cart1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case (R.id.button_minus1):
                if(amount > 1)
                    amount -= 1;
                tv_amount1.setText(String.valueOf(amount));
                break;
            case (R.id.button_add1):
                amount += 1;
                tv_amount1.setText(String.valueOf(amount));
                break;
            case (R.id.button_add_to_cart1):
                Toast.makeText(getApplicationContext(), "Added to cart", Toast.LENGTH_SHORT).show();
                Intent i = new Intent (ProductDetails2Activity.this, ShopActivityTest.class);
                i.putExtra("key", amount);
                startActivity(i);
                break;
            case (R.id.tv_reviews_view_all):
                Intent i2 = new Intent (ProductDetails2Activity.this, ReviewsActivity.class);
                startActivity(i2);
                break;
            case (R.id.tv_related_view_all):
                Toast.makeText(getApplicationContext(), "Function not implemented", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.related11):
            case (R.id.related12):
            case (R.id.related13):
            case (R.id.related14):
            case (R.id.related15):
            case (R.id.related16):
                Intent i3 = new Intent (ProductDetails2Activity.this, ProductDetailsActivity.class);
                startActivity(i3);
                break;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
