package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Government extends AppCompatActivity {

    private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("Account",
            "Accused", "Act", "Adult", "Administration", "Advice", "Advocate", "Agent", "Algebra",
            "Airplane", "Amendment", "Atom Bomb", "Application", "Approval",
            "Ambassador", "Appointment", "Bill", "Broadcasting", "Business", "Condition", "Discovery",
            "Diplomacy", "Election", "Experiment", "Evidence", "Fin Minister", "Fire Brigade", "Fare", "Gazette", "Government", "Grant",
            "Guardian", "Habit", "High Court", "Honorary", "Infantry", "Income Tax", "Institution"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Lekhaa (लेखा)", "Abhiyukt (शूअभियुक्तन्य)",
            "Adhiniyam (अधिनियम)", "Praudh (प्रौढ)", "Sasan (शासन)", "Salah (सलाह)", "Adhivakta (अधिवक्ता)",
            "Abhikarta (अभिकर्ता)", "Beej Ganit (बीजगणित)", "Vayuyan (वायुयान)", "Sanshodhan (संशोधन)", "Anumbam (अणुबम)",
            "Avedan Patra (आवेदनपत्र)", "Anumodan (अनुमोदन)", "Rajdoot (राजदूत)", "Niyukti (नियुक्ति)", "Vidheyak (विधेयक)",
            "Prasaaran (प्रसारण)", "Vyapaar (ब्यापार)", "Shart (शर्त)", "Aavishkaar (आविष्कार)", "Kootnit (कूटनीति)",
            "Chunav (चुनाव)", "Prayog (प्रयोग)", "Saachhy (साच्छी)", "Vitt Mantri (वित्त मंन्त्री)", "Damkal (दमकल)", "Kiraya (किराया)",
            "Suchana Patra (सूचनापत्र)", "Sarkaar (सरकार)", "Anudaan (अनुदान)", "Sanrakshak (सरक्षक)", "Aadat (आदत)",
            "Uchch-nyayalay (उच्च न्यायालय)", "Avaitanik (अवैतनिक्)", "Pad Sena (पद सेना)", "Aaykar (आयकर)", "Sansthaa (संस्था)"));

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
