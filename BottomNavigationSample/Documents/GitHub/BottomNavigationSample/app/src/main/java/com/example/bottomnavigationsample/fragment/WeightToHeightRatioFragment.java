package com.example.bottomnavigationsample.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bottomnavigationsample.R;

public class WeightToHeightRatioFragment extends Fragment {


    TextView txtUserView ;
    EditText edtUserWeight;
    EditText edtUserLenght;
    Button btnCal;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    private void calculate() {

        if (edtUserWeight.getText().toString().length() > 0 && edtUserLenght.getText().toString().length() > 0) {
            float userWeight =  Float.parseFloat(edtUserWeight.getText().toString());
            float userLength = Float.parseFloat(edtUserLenght.getText().toString());
            if(userLength>0){
                userLength = userLength / 100;
                float result = (userWeight / ((userLength * userLength)));

                String resultDescription = "";

                if (result < 18.5) {
                    resultDescription = "Düsük Kilo";
                } else if (result > 18.5 && result <= 24.9) {
                    resultDescription = "Normal Kilo";
                } else if (result > 25 && result <= 29.9) {
                    resultDescription = "Fazla Kilo";
                } else if (result > 30 && result <= 40) {
                    resultDescription = "Obez";
                } else if (result <40 ){
                    resultDescription = "Aşırı Obez)";
                }

                txtUserView.setText("Vücut kitle endeksiniz: " + result + "\n" + resultDescription);
            }}else {

            final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setTitle("Hata!");
            builder.setMessage("Kilo ve boy boş bırakılamaz.");
            builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id) {

                }
            });

            builder.show();
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_weight_to_height_ratio,null);

        txtUserView = view.findViewById(R.id.textView);
        edtUserWeight = view.findViewById(R.id.edtWeight);
        edtUserLenght = view.findViewById(R.id.edtLength);
        btnCal = view.findViewById(R.id.btnCalc);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
            }
        });

        return view;

    }
}
