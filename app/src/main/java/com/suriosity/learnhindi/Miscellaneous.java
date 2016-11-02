package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Miscellaneous extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Who", "What",
            "Where", "When", "Which", "How many", "This", "That",
            "These", "Those", "Same", "Different", "Whole",
            "Broken", "Few", "Many", "All"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Kaun (कौन)", "Kya (क्या)",
            "Kidhar (किधर)", "Kab (कब)", "Kaun Sa (कौन सा)", "Kitne (कितने)", "Yeh (यह)",
            "Woh (वह)", "Ye (ये)", "Wo (वो)", "Ek Jaisa (एक जैसा)", "Alag (अलग)",
            "Puraa (पूरा)", "Tuta (टूटा)", "Thora (थोडा)", "Ziada (ज्यादा)", "Sab (सब)"));

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
