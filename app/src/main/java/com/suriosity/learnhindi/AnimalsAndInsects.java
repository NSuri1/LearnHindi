package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsAndInsects extends AppCompatActivity {

    //ArrayList to hold words (not array so can change size

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Cat", "Sheep", "Camel",
            "Deer", "Elephant", "Horse", "Buffalo", "Goat", "Rabbit",
            "Rat", "Lamb", "Lion", "Tiger", "Squirrel"));

    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Billi (बिल्ली)", "Bhed (भेड्)", "Oont (ऊँट)",
            "Hiran (हिरन्)", "Hathi (हाथी)", "Ghoda (घोड़ा)", "Bhains (भैंस)", "Bakri (बकरी)", "Khargosh (खरगोश्)",
            "Chuhaa (चूहा)", "Memanaa (मेमना)", "Sinh (सिंह्)", "Sher (शेर्)", "Gilahari (गिलहरी)"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        createViews();

    }


    public void createViews(){

        //Create Words ArrayList since ArrayAdapter only takes in one array parameter
        ArrayList<Words> wordsArrayList = new ArrayList<Words>();

        //Fill array with english word and hindi translation by creating new word objects
        for(int i = 0; i < defaultWords.size() && i < hindiTranslation.size(); i++){
            wordsArrayList.add(new Words(defaultWords.get(i), hindiTranslation.get(i)));
        }

        //ArrayAdapter and ListView used so that not a lot of memory is used to create all textviews when not needed
        //Update** Using WordAdapter which extends ArrayAdapter and only has 2 parameters

        WordAdapter adapter = new WordAdapter(this, wordsArrayList);

        ListView listView = (ListView) findViewById(R.id.translation_root_view);

        listView.setAdapter(adapter);


    }


}
