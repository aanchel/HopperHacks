package com.example.hopperhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShelterList extends AppCompatActivity {
    private TextView textViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_list);
        //textViewList = (TextView) findViewById(R.id.textViewList);

        ShelterLogin.printList();
    }
}
