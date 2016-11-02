package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Relationships extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Family", "Relatives",
            "Father", "Mother", "Paternal Grandfather", "Paternal Grandmother", "Maternal Grandfather",
            "Maternal Grandmother", "Husband", "Wife", "Son", "Daughter",
            "Brother", "Sister"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Parivaar (परिवार्)", "Ristedaar (रिश्तेदार्)",
            "Pita/Baap (पिता/बाप्)", "Mata/Maa (माता/माँ)", "Dada (दादा)", "Dadi (दादी)",
            "Nana (नाना)", "Nani (नानी)", "Pati (पति)", "Patni (पत्नि)", "Beta (बेटा)",
            "Beti (बेटी)", "Bhai (भाई)", "Bahen (बहन)"));

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
