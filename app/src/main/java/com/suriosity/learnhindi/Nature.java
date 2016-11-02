package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Nature extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Nature", "Sun",
            "Moon", "Sky", "Star", "Rain", "Water", "River",
            "Cloud", "Lightning", "Rainbow", "Wind", "Stone",
            "Path", "Sand", "Village", "Mud", "Dust", "Gold", "Mortar",
            "Cement", "Masala", "Hammer"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Prakitri (प्रकृति)", "Suraj (सूरज)",
            "Chand (चाँद)", "Aasman (आसमान)", "Taaraa (तारा)", "Baris (बारीस)", "Pani (पानी)",
            "Nadi (नदी)", "Badal (बादल)", "Bijali (बिजली)", "Indra Dhanush (इन्द्र धनुष)", "Hawa (हवा)",
            "Patthar (पत्थर)", "Rasta (रास्ता)", "Ret (रेत)", "Gaon (गाँव)", "Keechar (कीचड्)",
            "Mitti (मिट्टी)", "Sona (सोना)", "Mortar (मोर्तार)", "Cement (सीमेण्ट)", "Masala (मसाला)",
            "Hathora (हथौडा)"));

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
