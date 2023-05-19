package com.example.try_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager=getSupportFragmentManager();
        //Vaccine->click->nutrition fragment open
        Button btNutrition=findViewById(R.id.button2);
        Button btExercise=findViewById(R.id.button3);
        Button btVaccine=findViewById(R.id.button);


        btVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,VaccineFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Vaccine")
                        .commit();
            }
        });

        //Exercise->click->nutrition fragment open

        btExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,ExerciseFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Exercise")
                        .commit();
                btExercise.setVisibility(View.GONE);
                btVaccine.setVisibility(View.GONE);
                btNutrition.setVisibility(View.GONE);
                toolbar.setVisibility(View.VISIBLE);
            }
        });

        //Nutrition ->click->nutrition fragment open

        btNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,NutritionFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Nutrition")
                        .commit();
                btExercise.setVisibility(View.GONE);
                btVaccine.setVisibility(View.GONE);
                btNutrition.setVisibility(View.GONE);
                toolbar.setVisibility(View.VISIBLE);
            }
        });


    }




}