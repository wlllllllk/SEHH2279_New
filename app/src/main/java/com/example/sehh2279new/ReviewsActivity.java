package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ReviewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        this.setTitle("Reviews");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
}
