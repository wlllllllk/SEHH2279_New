package com.example.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProductDetailsFragment extends Fragment {
    int amount = 1;
    TextView tvamount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product_details, container, false);

        getActivity().setTitle("Product details");
        TextView someTextView = (TextView) view.findViewById(R.id.textView4);
        tvamount = (TextView) view.findViewById(R.id.tv_amount);

        tvamount.setText("amount");

        //someTextView.setText("$9.9");
        //someTextView.setPaintFlags(someTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


        Button button_minus = (Button) view.findViewById(R.id.button_minus);
        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(amount > 0)
                    amount -= 1;
                tvamount.setText(String.valueOf(amount));
            }
        });

        Button button_add = (Button) view.findViewById(R.id.button_add);
        button_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                amount += 1;
                tvamount.setText(String.valueOf(amount));
            }
        });

        return view;
    }
}
