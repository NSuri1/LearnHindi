package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class BodyParts extends AppCompatActivity {

    private ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("Body", "Head",
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
    }
}
