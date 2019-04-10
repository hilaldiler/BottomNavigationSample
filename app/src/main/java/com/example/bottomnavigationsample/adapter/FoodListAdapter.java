package com.example.bottomnavigationsample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bottomnavigationsample.R;
import com.example.bottomnavigationsample.model.FoodList;

import java.util.List;

public class FoodListAdapter extends BaseAdapter {


    LayoutInflater layoutInflater;
    List<FoodList> listDiet;
    Context context;
    public FoodListAdapter(Context context, List<FoodList> list) {

        listDiet =  list;

        this.context = context;
    }

    @Override
    public int getCount() {
        return listDiet.size();
    }

    @Override
    public Object getItem(int position) {
        return listDiet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        view = View.inflate(context, R.layout.row, null);
        ImageView image = (ImageView)view.findViewById(R.id.imageViewEat);
        TextView tvName = (TextView)view.findViewById(R.id.textViewEatName);
        TextView tvCalori = (TextView)view.findViewById(R.id.textViewCal);
        FoodList dietList = listDiet.get(position);

        tvName.setText(dietList.getName());
        tvCalori.setText(dietList.getCalori());

        String name = dietList.getName();
        String calori = dietList.getCalori();
        if(name.equalsIgnoreCase("Zeytin"))
            image.setImageResource(R.drawable.olive);
        else if(name.equalsIgnoreCase("yumurta"))
            image.setImageResource(R.drawable.egg);
        else if (name.equalsIgnoreCase("peynir"))
            image.setImageResource(R.drawable.peynir);

        return view;
    }
}
