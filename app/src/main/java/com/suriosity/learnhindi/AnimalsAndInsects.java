package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsAndInsects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_and_insects);

        ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("meat", "fat", "fish",
                                         "chicken", "egg", "cow", "buffalo", "milk", "horns",
                                         "tail", "goat", "dog", "snake", "monkey", "mosquito",
                                         "ant", "spider"));

        ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("gosht (गोश्त)", "charbi (चर्बी)", "machhli (मछली)",
                                             "murgi (मुर्गी)", "anda (अण्डा)", "gae (गाय)", "bhaens (भैंस)", "dudh (दूध)", "seeng (सींग)",
                                             "dum (दुम)", "bakri (बकरी)", "kutta (कुत्ता)", "saanp (साँप)", "bandar (बन्दर)", "machchhar (मच्छर)",
                                             "chinti (चींटी)", "makri (मकडी)"));


        LinearLayout rootView = (LinearLayout) findViewById(R.id.numbers_root_view);

        
    }


}
