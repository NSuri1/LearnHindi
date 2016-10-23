package com.suriosity.learnhindi;

import android.content.Intent;
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
        Intent i;

        switch (v.getId()){
            case R.id.numbers_category:
                System.out.println("openNumbersView Function Called");
                i = new Intent(this, Numbers.class);
                startActivity(i);
                break;
            case R.id.days_category:
                System.out.println("openDaysView Function Called");
                i = new Intent(this, Days.class);
                startActivity(i);
                break;
            case R.id.relationships_category:
                System.out.println("openRelationships Function Called");
                i = new Intent(this, Relationships.class);
                startActivity(i);
                break;
            case R.id.fruits_and_vegetables_category:
                System.out.println("openFruitsandVegetablesView Function Called");
                i = new Intent(this, FruitsAndVegetables.class);
                startActivity(i);
                break;
            case R.id.pronouns_category:
                System.out.println("openPronounsView Function Called");
                i = new Intent(this, Pronouns.class);
                startActivity(i);
                break;
        }
    }
}
