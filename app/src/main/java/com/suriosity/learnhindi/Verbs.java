package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Verbs extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("To Eat", "To Bite",
            "To Be Hungry", "To Drink", "To Be Thirsty", "To Sleep", "To Lie",
            "To Sit", "To Give", "To Burn", "To Die", "To Kill",
            "To Fly", "To Walk", "To Run", "To Go", "To Come", "To Speak", "To Hear",
            "To Look", "To Knock"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Khana/Kha (खाना/खा)", "Kaatna (काटना)",
            "Bhukh Lagna (भूख लगना)", "Pina (पीना)", "Pyas Lagna (प्यास लगना)", "Sona (सोना)",
            "Letna (लेटना)", "Baethna (बैठना)", "Dena (देना)", "Jalaana (जलाना)", "Marna (मरना)",
            "Maarna (मारना)", "Udna (उडना)", "Chalna (चलना)", "Daurna (दौड्ना)", "Jaanaa (जाना)",
            "Aanaa (आना)", "Bolna (बोलना)", "Sunana (सुनना)", "Dekhna (देखना)", "KhatKhatana (खटखटाना)"));

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
