package com.example.bottomnavigationsample.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigationsample.R;
import com.example.bottomnavigationsample.fragment.FoodCaloriesFragment;
import com.example.bottomnavigationsample.fragment.WeightToHeightRatioFragment;
import com.example.bottomnavigationsample.fragment.HomeFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment selectedFragment = null;
                FragmentTransaction transaction
                        = getSupportFragmentManager().beginTransaction();

                if(menuItem.getItemId() == R.id.home) {
                    selectedFragment = new HomeFragment();

                }else if(menuItem.getItemId() == R.id.ratio) {
                    selectedFragment = new WeightToHeightRatioFragment();

                }else if(menuItem.getItemId() == R.id.calories) {

                    selectedFragment = new FoodCaloriesFragment();
                }

                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return false;
            }
        });


        FragmentTransaction transaction
                = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new HomeFragment());
        transaction.commit();
    }
}
