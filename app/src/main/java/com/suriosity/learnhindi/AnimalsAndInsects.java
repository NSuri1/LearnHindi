package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsAndInsects extends AppCompatActivity {

    ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("Meat", "Fat", "Fish",
            "Chicken", "Egg", "Cow", "Buffalo", "Milk", "Horns",
            "Tail", "Goat", "Dog", "Snake", "Monkey", "Mosquito",
            "Ant", "Spider"));

    ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Gosht (गोश्त)", "Charbi (चर्बी)", "Machhli (मछली)",
            "Murgi (मुर्गी)", "Anda (अण्डा)", "Gae (गाय)", "Bhaens (भैंस)", "Dudh (दूध)", "Seeng (सींग)",
            "Dum (दुम)", "Bakri (बकरी)", "Kutta (कुत्ता)", "Saanp (साँप)", "Bandar (बन्दर)", "Machchhar (मच्छर)",
            "Chinti (चींटी)", "Makri (मकडी)"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_and_insects);

        createViews();

    }


    public void createViews(){
        LinearLayout rootView = (LinearLayout) findViewById(R.id.animals_and_insects_root_view);
        TextView wordView = new TextView(this);
        wordView.setPadding(16, 16, 16, 16);
        wordView.setTextSize(20);

        wordView.setText(englishWords.get(0));

        rootView.addView(wordView);

    }


}
