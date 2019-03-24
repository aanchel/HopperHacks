package com.example.hopperhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;

public class ShelterNeedList extends AppCompatActivity {
    private TextView textNeed;
    private Button home3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_need_list);

        textNeed = (TextView) findViewById(R.id.textNeed);
        home3 = (Button) findViewById(R.id.home3);
        ShelterLogin.printNeedList();
        ArrayList<Shelter> food = ShelterLogin.food;
        ArrayList<Shelter> water = ShelterLogin.water;
        ArrayList<Shelter> clothes = ShelterLogin.clothes;
        ArrayList<Shelter> toiletries = ShelterLogin.toiletries;
        ArrayList<Shelter> blankets = ShelterLogin.blankets;
        String temp = "";
        for (int i = 0; i < food.size(); i++) {
            temp += food.get(i).toString() + "\n";
        }
        String temp2 = "";
        for (int i = 0; i < water.size(); i++) {
            temp2 += water.get(i).toString() + "\n";
        }
        String temp3 = "";
        for (int i = 0; i < clothes.size(); i++) {
            temp3 += clothes.get(i).toString() + "\n";
        }
        String temp4 = "";
        for (int i = 0; i < toiletries.size(); i++) {
            temp4 += toiletries.get(i).toString() + "\n";
        }
        String temp5 = "";
        for (int i = 0; i < blankets.size(); i++) {
            temp5 += blankets.get(i).toString() + "\n";
        }
        String print1 = "Shelters that need food near you: \n\r";
        String print2 = "Shelters that need water near you: \n\r";
        String print3 = "Shelters that need clothes near you: \n\r";
        String print4 = "Shelters that need toiletries near you: \n\r";
        String print5 = "Shelters that need blankets near you: \n\r";

        textNeed.setText(print1 + temp + print2 + temp2 + print3 + temp3+ print4+ temp4+print5+temp5);

        home3Functionality();
    }
    private void home3Functionality() {
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(ShelterNeedList.this, MainLogin.class));
            }
        });
    }
}
