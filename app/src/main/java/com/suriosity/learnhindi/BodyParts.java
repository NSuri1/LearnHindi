package com.suriosity.learnhindi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class BodyParts extends AppCompatActivity {

    ArrayList<String> englishWords = new ArrayList<String>(Arrays.asList("body", "head",
                                     "hair", "face", "eye", "ear", "nose", "mouth", "teeth",
                                     "tongue", "breast", "belly", "arm", "hand", "elbow",
                                     "palm", "finger", "fingernail", "leg", "skin", "bone",
                                     "heart", "blood", "urine", "feces"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_parts);
    }
}
