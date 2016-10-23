package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersView(View v){
        System.out.println("openNumbersView Function Called");
        setContentView(R.layout.activity_numbers);
    }

    public void openDaysView(View v){
        System.out.println("openDaysView Function Called");
    }

    public void openRelationshipsView(View v){
        System.out.println("openRelationships Function Called");
    }

    public void openFruitsAndVegetablesView(View v){
        System.out.println("openFruitsandVegetablesView Function Called");
    }

    public void openPronounsView(View v){
        System.out.println("openPronounsView Function Called");
    }
}
