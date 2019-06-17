package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Phrases> phrasesLists =  new ArrayList<Phrases>();
        phrasesLists.add(new Phrases("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrasesLists.add(new Phrases("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phrasesLists.add(new Phrases("My Name is ..","oyaaset...",R.raw.phrase_my_name_is));
        phrasesLists.add(new Phrases("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrasesLists.add(new Phrases("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        phrasesLists.add(new Phrases("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrasesLists.add(new Phrases("Yes, I’m coming. ","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrasesLists.add(new Phrases("I’m coming. ","әәnәm",R.raw.phrase_im_coming));
        phrasesLists.add(new Phrases("Let’s go","yoowutis",R.raw.phrase_lets_go));
        phrasesLists.add(new Phrases(" Come here","әnni'nem",R.raw.phrase_come_here));


        PhrasesAdapter adapter =  new PhrasesAdapter(this,phrasesLists,R.color.category_phrases);
        ListView listView = findViewById(R.id.phrasesListView);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phrases currMember=phrasesLists.get(position);
                MediaPlayer pronun = MediaPlayer.create(PhrasesActivity.this,currMember.getMusicResourceId());
                pronun.start();
            }
        });
    }
}
