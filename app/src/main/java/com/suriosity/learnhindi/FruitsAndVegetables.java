package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitsAndVegetables extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Fruit", "Apple",
                                            "Banana", "Grapes", "Guava", "Mango", "Musk Mellon", "Papaya",
                                            "Pomegranate", "Watermelon", "Vegetable", "Cauliflower", "Cabbage",
                                            "Carrot", "Cucumber", "Eggplant", "Lemon", "Onion", "Peas", "Potato",
                                            "Pumpkin", "Raddish", "Tomato"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Phal (फल)", "Sev (सेव्)",
                                                "Kela (केला)", "Angoor (अंगूर्)", "Amrud (अमरूद्)", "Aam (आम)", "Kharbuza (खरबुजा)",
                                                "Papita (पपीता)", "Anar (अनार्)", "Tarbuza (तरबुजा)", "Sabzi (सब्जी)", "Phul Gobhi (फुलगोभी)",
                                                "Band Ghobi (बन्दगोभी)", "Gajar (गाजर्)", "Kheera (खीरा)", "Baigan (बैगन)", "Nibu (नीबु)",
                                                "Piaz (प्याज)", "Mutter (मटर्)", "Aloo (आलू)", "Kaddu (कद्दु)", "Mooli (मूली)",
                                                "Tamatar (टमाटर)"));

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
