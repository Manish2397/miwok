package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<NumberWordsClass> {
    int backgroundColor;

    public WordAdapter(Activity context, ArrayList<NumberWordsClass> words,int bgColor) {
        super(context,0, words);
        backgroundColor = bgColor;

    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listitem=convertView;
        if (listitem==null){
            listitem= LayoutInflater.from(getContext()).inflate(
                    R.layout.numbers_list_view, parent, false);
        }
        NumberWordsClass currentNumberWordClass = getItem(position);
        TextView miwokTextView = (TextView) listitem.findViewById(R.id.miwokTranslation);
        miwokTextView.setText(currentNumberWordClass.getMiwokTranslation());
        TextView englishTextView = (TextView) listitem.findViewById(R.id.englishranslation);
        englishTextView.setText(currentNumberWordClass.getDefaultTranslation());
        ImageView imageIcon = listitem.findViewById(R.id.imageIcon);
        imageIcon.setImageResource(currentNumberWordClass.getImageResourceId());
        LinearLayout textViewContainer = listitem.findViewById(R.id.textViewContainer);
        textViewContainer.setBackgroundResource(backgroundColor);
        return listitem;
    }
}
