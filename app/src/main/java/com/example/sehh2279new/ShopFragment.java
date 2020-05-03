package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class ShopFragment extends Fragment implements View.OnClickListener{

    Button sortfilter;
    LinearLayout p1, p2, p3, p4, p5, p6;
    ImageView i1, i2, i3, i4, i5, i6;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Shop");
        View view = inflater.inflate(R.layout.fragment_shop, container, false);

        sortfilter = view.findViewById(R.id.button_sortfilter);

        p1 = view.findViewById(R.id.p1);
        p2 = view.findViewById(R.id.p2);
        p3 = view.findViewById(R.id.p3);
        p4 = view.findViewById(R.id.p4);
        p5 = view.findViewById(R.id.p5);
        p6 = view.findViewById(R.id.p6);

        i1 = view.findViewById(R.id.add1);
        i2 = view.findViewById(R.id.add2);
        i3 = view.findViewById(R.id.add3);
        i4 = view.findViewById(R.id.add4);
        i5 = view.findViewById(R.id.add5);
        i6 = view.findViewById(R.id.add6);

        sortfilter.setOnClickListener(this);

        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_sortfilter:
                Intent i = new Intent(getContext(), SortFilterActivity.class);
                startActivity(i);
                break;
            case R.id.p1:
            case R.id.p2:
            case R.id.p3:
            case R.id.p4:
            case R.id.p5:
                Intent i2 = new Intent(getContext(), ProductDetailsActivity.class);
                startActivity(i2);
                break;
            case R.id.p6:
                Intent i3 = new Intent(getContext(), ProductDetails2Activity.class);
                startActivity(i3);
                break;
            case R.id.add1:
            case R.id.add2:
            case R.id.add3:
            case R.id.add4:
            case R.id.add5:
            case R.id.add6:
                Toast.makeText(getContext(), "Added to cart", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
