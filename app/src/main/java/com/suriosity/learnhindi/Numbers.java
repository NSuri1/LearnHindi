package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers extends AppCompatActivity {

        private ArrayList<String> defaultWords = new ArrayList<String>(Arrays.asList("How Many",
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
                "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred", "One Hundred",
                "One Thousand", "Hundred Thousand", "One Million", "Ten Million", "One Billion"));
        private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Kitne (कितने)", "Shunya (शून्य)",
                "Ek (एक)", "Do (दो)", "Teen (तीन)", "Char (चार)", "Paanch (पांच)",
                "Chheh (छः)", "Saat (सात)", "Aath (आठ)", "Nao (नौ)", "Das (दस)",
                "Gyarah (ग्यारह)", "Barah (बारह)", "Terah (तेरह)", "Chaudah (चौदह)", "Pandrah (पंद्रह)",
                "Solah (सोलह)", "Satrah (सत्रह)", "Atharah (अठारह)", "Unnis (उन्नीस)", "Bees (बीस)",
                "Tees (तीस)", "Chaalees (चालीस)", "Pachaas (पचास)", "Saath (साठ)", "Sattar (सत्तरुष)", "Assi (अस्सी)",
                "Nabbe (नब्बे)", "Sau (सौ)", "Ek Sau (एक सौ)", "Ek Hazaar (एक हजार)", "Ek Lakh (एक लाख)",
                "Das Lakh (दस लाख)", "Ek Crore (एक करोड्)", "Ek Arab (एक अरब)"));

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
