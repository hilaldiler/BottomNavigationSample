package com.example.bottomnavigationsample.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.bottomnavigationsample.R;
import com.example.bottomnavigationsample.adapter.FoodListAdapter;
import com.example.bottomnavigationsample.model.FoodList;

import java.util.ArrayList;
import java.util.List;

public class FoodCaloriesFragment extends Fragment {

    ListView listView;
    List<FoodList> list = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list.add(new FoodList("Yumurta", "78 cal"));
        list.add(new FoodList("Peynir", "93 cal"));
        list.add(new FoodList("Zeytin", "53 cal"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_calories, null);
        listView = view.findViewById(R.id.caloriListView);

        FoodListAdapter adapter = new FoodListAdapter(getContext(), list);
        listView.setAdapter(adapter);




        return view;
    }
}
