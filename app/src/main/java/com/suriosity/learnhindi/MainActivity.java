package com.suriosity.learnhindi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String NOT_FOUND = "View not found";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView animalsAndInsectsView = (TextView) findViewById(R.id.animals_and_insects_category);
        final TextView bodyPartsView = (TextView) findViewById(R.id.body_parts_category);
        final TextView conditionAndColorView = (TextView) findViewById(R.id.condition_and_color_category);
        final TextView governmentView = (TextView) findViewById(R.id.government_and_business_category);
        final TextView natureView = (TextView) findViewById(R.id.nature_category);
        final TextView fruitsAndVegetablesView = (TextView) findViewById(R.id.fruits_and_vegetables_category);
        final TextView numbersView = (TextView) findViewById(R.id.numbers_category);
        final TextView pronounsView = (TextView) findViewById(R.id.pronouns_category);
        final TextView verbsView = (TextView) findViewById(R.id.verbs_category);
        final TextView relationshipsView = (TextView) findViewById(R.id.relationships_category);
        final TextView daysView = (TextView) findViewById(R.id.days_category);
        final TextView miscellaneousView = (TextView) findViewById(R.id.miscellaneous_category);

        animalsAndInsectsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        bodyPartsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        conditionAndColorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        governmentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        natureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        fruitsAndVegetablesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        animalsAndInsectsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        pronounsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        verbsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        relationshipsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        daysView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });

        miscellaneousView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(v.getId());
            }
        });


    }

    public void changeView(int id) {
        Intent i;

        switch (id) {
            case R.id.animals_and_insects_category:
                i = new Intent(this, AnimalsAndInsects.class);
                startActivity(i);
                break;
            case R.id.body_parts_category:
                i = new Intent(this, BodyParts.class);
                startActivity(i);
                break;
            case R.id.condition_and_color_category:
                i = new Intent(this, ConditionAndColors.class);
                startActivity(i);
                break;
            case R.id.days_category:
                i = new Intent(this, Days.class);
                startActivity(i);
                break;
            case R.id.fruits_and_vegetables_category:
                i = new Intent(this, FruitsAndVegetables.class);
                startActivity(i);
                break;
            case R.id.government_and_business_category:
                i = new Intent(this, Government.class);
                startActivity(i);
                break;
            case R.id.miscellaneous_category:
                i = new Intent(this, Miscellaneous.class);
                startActivity(i);
                break;
            case R.id.nature_category:
                i = new Intent(this, Nature.class);
                startActivity(i);
                break;
            case R.id.numbers_category:
                i = new Intent(this, Numbers.class);
                startActivity(i);
                break;
            case R.id.pronouns_category:
                i = new Intent(this, Pronouns.class);
                startActivity(i);
                break;
            case R.id.relationships_category:
                i = new Intent(this, Relationships.class);
                startActivity(i);
                break;
            case R.id.verbs_category:
                i = new Intent(this, Verbs.class);
                startActivity(i);
                break;
            default:
                Log.i("Main Activity", NOT_FOUND);
        }
    }
}
