package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SortFilterActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_filter);

        this.setTitle("Sort & Filter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addListenerOnButton();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    public void addListenerOnButton() {
        button = (Button) findViewById(R.id.button);//declare which button will be called
        //prepare button to be ready when clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SortFilterActivity.this, FilterActivity.class);
                startActivity(intent);
            }
        });
    }
}
