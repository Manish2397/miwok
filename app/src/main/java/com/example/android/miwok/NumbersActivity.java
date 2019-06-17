package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<NumberWordsClass> words = new ArrayList<NumberWordsClass>();
        words.add(new NumberWordsClass("One","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new NumberWordsClass("Two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new NumberWordsClass("Three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new NumberWordsClass("Four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new NumberWordsClass("Five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new NumberWordsClass("Six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new NumberWordsClass("Seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new NumberWordsClass("Eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new NumberWordsClass("Nine","wo’e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new NumberWordsClass("Ten","na’aacha",R.drawable.number_ten,R.raw.number_ten));

//
//        LinearLayout rootView = findViewById(R.id.rootView);
//        for (int i=0;i<words.size();i++){
//            TextView textView = new TextView(this);
//            textView.setText(words.get(i));
//            textView.setTextSize(50);
//            rootView.addView(textView);
//        }
        WordAdapter wordsAdapter = new WordAdapter(this , words,R.color.category_numbers);
        final ListView listView = findViewById(R.id.listview);
        listView.setAdapter(wordsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NumberWordsClass currword = words.get(position);
                MediaPlayer pronun = MediaPlayer.create(NumbersActivity.this,currword.getMusicResourceId());
                pronun.start();
            }
        });
    }
}
