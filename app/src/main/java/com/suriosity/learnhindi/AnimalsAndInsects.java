package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class AnimalsAndInsects extends AppCompatActivity {

    String[] englishWords = { "meat", "fat", "fish", "chicken", "egg", "cow", "buffalo", "milk", "horns",
                              "tail", "goat", "dog", "snake", "monkey", "mosquito", "ant", "spider"
                                };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_and_insects);

        for(int i=0; i<englishWords.length; i++){
            Log.i("AnimalsAndInsects", englishWords[i]);
        }
    }


}
