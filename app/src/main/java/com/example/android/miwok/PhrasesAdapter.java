package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesAdapter extends ArrayAdapter<Phrases> {
    int backgroundColor;

    public PhrasesAdapter(Context context, ArrayList<Phrases> phraseList, int bgColor) {
        super(context, 0, phraseList);
        backgroundColor = bgColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.numbers_list_view, parent, false);
        }
        Phrases currentPhrase = getItem(position);
        TextView miwokTextView = listItem.findViewById(R.id.miwokTranslation);
        miwokTextView.setText(currentPhrase.getMiwokTranslation());
        TextView defaultTextView = listItem.findViewById(R.id.englishranslation);
        defaultTextView.setText(currentPhrase.getDefaultTranslation());
        LinearLayout textViewContainer = listItem.findViewById(R.id.textViewContainer);
        textViewContainer.setBackgroundResource(backgroundColor);
        ImageView imageIcon = listItem.findViewById(R.id.imageIcon);
        imageIcon.setVisibility(View.GONE);
        return listItem;
    }
}
