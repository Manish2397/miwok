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

public class FamilyAdapter extends ArrayAdapter<Family> {
    int backgroundColor;
    public FamilyAdapter(Context context, ArrayList<Family> familyList,int bgColor){
        super(context,0,familyList);
        backgroundColor = bgColor;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItem = convertView;
        if(listItem==null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.numbers_list_view,parent,false);
        }
        Family currentFamily = getItem(position);
        TextView miwokTranslation = listItem.findViewById(R.id.miwokTranslation);
        miwokTranslation.setText(currentFamily.getFamilyMiwokTranslaation());
        TextView defaultTranslation = listItem.findViewById(R.id.englishranslation);
        defaultTranslation.setText(currentFamily.getFamilyDefaultTranslation());
        LinearLayout textView = listItem.findViewById(R.id.textViewContainer);
        textView.setBackgroundResource(backgroundColor);
        ImageView imageIcon = listItem.findViewById(R.id.imageIcon);
        imageIcon.setImageResource(currentFamily.getImageResourceId());
        return listItem;
    }
}
