package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsAndInsects extends AppCompatActivity {

    private ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("Cat", "Sheep", "Camel",
            "Deer", "Elephant", "Horse", "Buffalo", "Goat", "Rabbit",
            "Rat", "Lamb", "Lion", "Tiger", "Squirrel"));

    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Billi (बिल्ली)", "Bhed (भेड्)", "Oont (ऊँट)",
            "Hiran (हिरन्)", "Hathi (हाथी)", "Ghoda (घोड़ा)", "Bhains (भैंस)", "Bakri (बकरी)", "Khargosh (खरगोश्)",
            "Chuhaa (चूहा)", "Memanaa (मेमना)", "Sinh (सिंह्)", "Sher (शेर्)", "Gilahari (गिलहरी)"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_and_insects);

        createViews();

    }


    public void createViews(){
        LinearLayout rootView = (LinearLayout) findViewById(R.id.animals_and_insects_root_view);
        TextView wordView;

        for(int i=0; i<englishWords.size(); i++){
            wordView = new TextView(this);
            wordView.setPadding(24, 24, 24, 24);
            wordView.setTextSize(20);
            wordView.setText(englishWords.get(i));
            rootView.addView(wordView);
        }





    }


}
