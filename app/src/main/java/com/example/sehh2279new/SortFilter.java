package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SortFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_filter);

        this.setTitle("Sort & Filter");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
