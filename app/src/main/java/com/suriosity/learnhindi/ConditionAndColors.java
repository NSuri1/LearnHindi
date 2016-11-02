package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class ConditionAndColors extends AppCompatActivity {

    private ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("Old", "New",
                                    "Good", "Bad", "Wet", "Dry", "Long", "Short",
                                    "Hot", "Cold", "Near", "Far", "Big", "Small", "Heavy",
                                    "Light", "Above", "Below"));
    private ArrayList<String> hindiTranslation = new ArrayList<String>(Arrays.asList("Purana (पुराना)",
                                        "Naya (नया)", "Achcha (अच्छा)", "Bura/Kharab (बुरा, खराब)", "Bhiga/Gilaa (भीगा, गीला)",
                                        "Sukhaa (सूखा)", "Lamba (लम्बा)", "Chhota (छोटा)", "Garam (गरम)", "Thanda (ठंडा)",
                                        "Karib/Pass (करीब)", "Door (दूर)", "Bada (बड़ा)", "Chota (छोटा)", "Bhari (भारी)",
                                        "Halka (हल्का)", "Upar (ऊपर)", "Niche (नीचे)"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);
    }
}
