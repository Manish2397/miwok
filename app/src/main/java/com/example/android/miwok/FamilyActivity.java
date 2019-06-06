package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Family>  familyList = new ArrayList<Family>();
        familyList.add(new Family("father","әpә",R.drawable.family_father));
        familyList.add(new Family("mother","әṭa",R.drawable.family_mother));
        familyList.add(new Family("son","angsi",R.drawable.family_son));
        familyList.add(new Family("daughter","tune",R.drawable.family_daughter));
        familyList.add(new Family("older brother","taachi",R.drawable.family_older_brother));
        familyList.add(new Family("younger brother","chalitti",R.drawable.family_younger_brother));
        familyList.add(new Family("older sister","teṭe",R.drawable.family_older_sister));
        familyList.add(new Family("younger sister","kolliti",R.drawable.family_younger_sister));
        familyList.add(new Family("grandmother","ama",R.drawable.family_grandmother));
        familyList.add(new Family("grandfather","paapa",R.drawable.family_grandfather));

        FamilyAdapter adapter = new FamilyAdapter(this,familyList,R.color.category_family);
        ListView familyListView = findViewById(R.id.familyListView);
        familyListView.setAdapter(adapter);
    }
}
