package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailsActivity extends AppCompatActivity implements View.OnClickListener{

    int amount = 1;
    TextView tv_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tv_amount = (TextView) findViewById(R.id.tv_amount);
        tv_amount.setText(String.valueOf(amount));

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
                break;
        }
    }

}
