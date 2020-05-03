package com.example.sehh2279new;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        this.setTitle("Checkout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView x = findViewById(R.id.imageView27);
        ImageView y = findViewById(R.id.imageView32);
        ImageView z = findViewById(R.id.imageView33);
        /*TextView quantitytext2 = findViewById(R.id.textView86);
        TextView pricetext2 = findViewById(R.id.textView84);
        TextView totaltext2 = findViewById(R.id.textView92);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key1");
        quantitytext2.setText(value);
        String price = extras.getString("key2");
        pricetext2.setText(price);
        String total = extras.getString("key3");
        totaltext2.setText("$ "+total);*/

        x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(payment.this,ConfirmationActivity.class);
                startActivity(i);
            }
        });
        y.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(payment.this,ConfirmationActivity.class);
                startActivity(i);
            }
        });
        z.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(payment.this,ConfirmationActivity.class);
                startActivity(i);
            }
        });
    }
}