package com.suriosity.learnhindi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Class created to allow ArrayAdapter to have both translations rather than 1
 * Created by Macbook on 11/1/16.
 */
public class WordAdapter extends ArrayAdapter<Words> {

    public WordAdapter(Activity context, ArrayList<Words> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if(listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list, parent, false);
        }

        Words currentWord = getItem(position);

        TextView hindiView = (TextView) listItem.findViewById(R.id.hindi_translation);
        hindiView.setText(currentWord.getHindi());

        TextView defaultTranslation = (TextView) listItem.findViewById(R.id.default_word);
        defaultTranslation.setText(currentWord.getDefaultWord());

        return listItem;
    }

}
