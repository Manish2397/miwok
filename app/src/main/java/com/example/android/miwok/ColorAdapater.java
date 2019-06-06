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

public class ColorAdapater extends ArrayAdapter<ColorName> {
    int backgroundColor;
    public ColorAdapater(Context context, ArrayList<ColorName> colorList,int bgColor){
        super(context,0,colorList);
        backgroundColor = bgColor;

    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listitem = convertView;
        if (listitem==null){
            listitem = LayoutInflater.from(getContext()).inflate(R.layout.numbers_list_view,parent,false);

        }
        ColorName currentColorName = getItem(position);
        TextView miwokTranslation = listitem.findViewById(R.id.miwokTranslation);
        miwokTranslation.setText(currentColorName.getMiwokColorTranslation());
        TextView englishTranslation = listitem.findViewById(R.id.englishranslation);
        englishTranslation.setText(currentColorName.getDefaultColorTranslation());
        ImageView imageIcon = listitem.findViewById(R.id.imageIcon);
        imageIcon.setImageResource(currentColorName.getImageResoureId());
        LinearLayout textViewContainer = listitem.findViewById(R.id.textViewContainer);
        textViewContainer.setBackgroundResource(backgroundColor);
        return listitem;
    }
}
