package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<ColorName> colorList= new ArrayList<ColorName>();
        colorList.add(new ColorName("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colorList.add(new ColorName("green","chokokki",R.drawable.color_green,R.raw.color_green));
        colorList.add(new ColorName("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colorList.add(new ColorName("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colorList.add(new ColorName("black","kululli",R.drawable.color_black,R.raw.color_black));
        colorList.add(new ColorName("white","kelelli",R.drawable.color_white,R.raw.color_white));
        colorList.add(new ColorName("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorList.add(new ColorName("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_dusty_yellow));


        ColorAdapater adapater = new ColorAdapater(this,colorList,R.color.category_colors);
        ListView list = findViewById(R.id.colorlistview);
        list.setAdapter(adapater);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ColorName currcolor = colorList.get(position);
                MediaPlayer pronun = MediaPlayer.create(ColorsActivity.this, currcolor.getMusicResourceId());
                pronun.start();
            }
        });

    }
}
