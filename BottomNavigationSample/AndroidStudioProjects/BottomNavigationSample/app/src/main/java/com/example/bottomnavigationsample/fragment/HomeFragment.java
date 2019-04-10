package com.example.bottomnavigationsample.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bottomnavigationsample.R;

public class HomeFragment extends Fragment {

    ImageView img;
    TextView txtDiet;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lunch,null);
        img = view.findViewById(R.id.imageViewDiet);
        txtDiet = view.findViewById(R.id.textViewDiet);

        return view;


    }



}
