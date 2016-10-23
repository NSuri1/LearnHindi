package com.suriosity.learnhindi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeView(View v){
        switch (v.getId()){
            case R.id.numbers_category:
                System.out.println("openNumbersView Function Called");
                break;
            case R.id.days_category:
                System.out.println("openDaysView Function Called");
                break;
            case R.id.relationships_category:
                System.out.println("openRelationships Function Called");
                break;
            case R.id.fruits_and_vegetables_category:
                System.out.println("openFruitsandVegetablesView Function Called");
                break;
            case R.id.pronouns_category:
                System.out.println("openPronounsView Function Called");
                break;
        }
    }
}
