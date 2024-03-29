package com.example.sehh2279new;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


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

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}