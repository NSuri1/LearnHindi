package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Pronouns extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("I", "You (informal)",
            "You (formal)", "You (plural)", "He/She", "We", "They",
            "Mine", "Ours", "Yours", "His", "Her",
            "Theirs", "This", "These", "That", "Those"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Mai (मैं)", "Tum (तुम)",
            "Aap (आप)", "Aap log (आप लोग)", "Vo (वो)", "Hum (हम)",
            "Vo Log (वो लोग)", "Mera (मेरा)", "Humara (हमारा)", "Aapka (आपका)", "Uska (उसका)",
            "Uski (उसकी)", "Unka (उनका)", "Yeh (यह्)", "Ye (ये)", "Vah (वह्)", "Vey (वे)"));

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
