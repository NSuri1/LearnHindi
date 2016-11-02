package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class BodyParts extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Body", "Head",
                                    "Hair", "Face", "Eye", "Ear", "Nose", "Mouth", "Teeth",
                                    "Tongue", "Breast", "Belly", "Arm", "Hand", "Elbow",
                                    "Palm", "Finger", "Fingernail", "Leg", "Skin", "Bone",
                                    "Heart", "Blood", "Urine", "Feces"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Badan (बदन)",
                                        "Sar (सर)", "Baal (बाल)", "Chehra (चेहरा)", "Ankh (आँख)",
                                        "Kaan (कान)", "Naak (नाक)", "Munh (मुँह)", "Daat (दाँत)",
                                        "Jibh (जीभ)", "Chhaati (छाती)", "Pet (पेट)", "Baazoo (बाजू)",
                                        "Haath (हाथ)", "Kohni (कोहनी)", "Hatheli (हथेली)", "Ungli (ऊंगली)",
                                        "Nakhun (नाखून)", "Taang (टाँग)", "Chamari (चमडी)",
                                        "Haddi (हड्डी)", "Dil (दिल)", "Khoon (खून)",
                                        "Peshab (पेशाब)", "Paikhaana (पैखाना)"));

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
