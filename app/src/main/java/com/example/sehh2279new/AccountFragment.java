package com.example.sehh2279new;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AccountFragment extends Fragment implements View.OnClickListener{

    private boolean show_address = false, show_personal = false;
    private TextView tv_address, tv_personal, tv_edita, tv_editp, tv_shoprecords, tv_member;
    private Button button_logout;
    private int trial = 0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Account");
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        tv_address = (TextView) view.findViewById(R.id.textView36);
        tv_personal = (TextView) view.findViewById(R.id.textView38);
        tv_edita = (TextView) view.findViewById(R.id.textView39);
        tv_editp = (TextView) view.findViewById(R.id.textView40);
        tv_shoprecords = (TextView) view.findViewById(R.id.tv_shoprecords);
        tv_member = (TextView) view.findViewById(R.id.tv_member);

        button_logout = (Button) view.findViewById(R.id.button5);

        tv_address.setOnClickListener(this);
        tv_personal.setOnClickListener(this);
        tv_edita.setOnClickListener(this);
        tv_editp.setOnClickListener(this);
        tv_shoprecords.setOnClickListener(this);
        tv_member.setOnClickListener(this);

        button_logout.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.textView36):
                if(!show_address){
                    tv_address.setText("8 Hung Lok Road, Hung Hom, Kowloon");
                    show_address = true;
                } else {
                    tv_address.setText("Press to view");
                    show_address = false;
                }
                break;
            case (R.id.textView38):
                if(!show_personal){
                    tv_personal.setText("Phone no.: 5896 5555 \n" +
                                        "Email address: chungwaichun@gmail.com \n" +
                                        "Gender: Male \n" +
                                        "Date of birth: 01/01/2000");
                    show_personal = true;
                } else {
                    tv_personal.setText("Press to view");
                    show_personal = false;
                }
                break;
            case (R.id.tv_member):
            case (R.id.textView39):
            case (R.id.textView40):
                Toast.makeText(getContext(), "Function not implemented", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.button5):
                trial++;
                button_logout.setText("PRESS AGAIN TO LOGOUT");
                button_logout.setBackgroundResource(R.drawable.button_rounded_realred);
                if (trial == 2 && button_logout.getText().equals("PRESS AGAIN TO LOGOUT")){
                    Toast.makeText(getContext(), "Logout successfully", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getActivity(), LoginActivity.class);
                    startActivity(i);
                }
                break;
            case (R.id.tv_shoprecords):
                Intent i = new Intent(getActivity(), ShoppingRecordsActivity.class);
                startActivity(i);
                break;
        }
    }
}
