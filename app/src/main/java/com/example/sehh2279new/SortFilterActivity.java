package com.example.sehh2279new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SortFilterActivity extends AppCompatActivity implements View.OnClickListener{

    private Button letter, reset, apply, price;
    private Spinner spinner_special_offer, spinner_category, spinner_country;
    private EditText editText_lower, editText_upper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_filter);

        this.setTitle("Sort & Filter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        letter = findViewById(R.id.letter);
        reset = findViewById(R.id.reset);
        apply = findViewById(R.id.apply);
        price = findViewById(R.id.price);
        spinner_special_offer = findViewById(R.id.spinner_special_offer);
        spinner_category = findViewById(R.id.spinner_category);
        spinner_country = findViewById(R.id.spinner_country);
        editText_lower = findViewById(R.id.editText_lower);
        editText_upper = findViewById(R.id.editText_upper);

        letter.setOnClickListener(this);
        reset.setOnClickListener(this);
        apply.setOnClickListener(this);
        price.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.letter:
                if(letter.getText().equals("Letter (A - Z)"))
                    letter.setText("Letter (Z - A)");
                else
                    letter.setText("Letter (A - Z)");
                break;
            case R.id.price:
                if(price.getText().equals("Price (High - Low)"))
                    price.setText("Price (Low - High)");
                else
                    price.setText("Price (High - Low)");
                break;
            case R.id.reset:
                letter.setText("Letter (A - Z)");
                price.setText("Price (High - Low)");
                spinner_special_offer.setSelection(0);
                spinner_category.setSelection(0);
                spinner_country.setSelection(0);
                editText_lower.setText("");
                editText_upper.setText("");
                break;
            case R.id.apply:
                Toast.makeText(this, "Function not implemented", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //23

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
