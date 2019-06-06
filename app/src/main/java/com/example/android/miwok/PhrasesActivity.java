package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Phrases> phrasesLists =  new ArrayList<Phrases>();
        phrasesLists.add(new Phrases("Where are you going?","minto wuksus"));
        phrasesLists.add(new Phrases("What is your name?","tinnә oyaase'nә"));
        phrasesLists.add(new Phrases("My Name is ..","oyaaset..."));
        phrasesLists.add(new Phrases("How are you feeling?","michәksәs?"));
        phrasesLists.add(new Phrases("I’m feeling good.","kuchi achit"));
        phrasesLists.add(new Phrases("Are you coming?","әәnәs'aa?"));
        phrasesLists.add(new Phrases("Yes, I’m coming. ","hәә’ әәnәm"));
        phrasesLists.add(new Phrases("I’m coming. ","әәnәm"));
        phrasesLists.add(new Phrases("Let’s go","yoowutis"));
        phrasesLists.add(new Phrases(" Come here","әnni'nem"));


        PhrasesAdapter adapter =  new PhrasesAdapter(this,phrasesLists,R.color.category_phrases);
        ListView listView = findViewById(R.id.phrasesListView);
        listView.setAdapter(adapter);
    }
}
