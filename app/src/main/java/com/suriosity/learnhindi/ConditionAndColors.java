package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ConditionAndColors extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Old", "New",
                                    "Good", "Bad", "Wet", "Dry", "Long", "Short",
                                    "Hot", "Cold", "Near", "Far", "Big", "Small", "Heavy",
                                    "Light", "Above", "Below", "White", "Black", "Red", "Blue",
                                    "Brown", "Green", "Pink", "Yellow", "Orange"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Purana (पुराना)",
                                        "Naya (नया)", "Achcha (अच्छा)", "Bura/Kharab (बुरा, खराब)", "Bhiga/Gilaa (भीगा, गीला)",
                                        "Sukhaa (सूखा)", "Lamba (लम्बा)", "Chhota (छोटा)", "Garam (गरम)", "Thanda (ठंडा)",
                                        "Karib/Pass (करीब)", "Door (दूर)", "Bada (बड़ा)", "Chota (छोटा)", "Bhari (भारी)",
                                        "Halka (हल्का)", "Upar (ऊपर)", "Niche (नीचे)", "Safed (सफेद)", "Kala (काला)",
                                        "Lal (लाल)", "Neela (नीला)", "Bhura (भूरा)", "Hara (हरा)", "Gulabi (गुलाबी)",
                                        "Peela (पीला)", "Narangi (नारंगी)"));

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
