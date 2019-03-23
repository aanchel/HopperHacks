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
        textViewList = (TextView) findViewById(R.id.textViewList);

        ShelterLogin.printList();

        ArrayList<Shelter> unsorted = ShelterLogin.unsorted;

        ArrayList<Shelter> homeless = ShelterLogin.homeless;
        ArrayList<Shelter> hurricane = ShelterLogin.hurricane;
        ArrayList<Shelter> pet = ShelterLogin.pet;
        ArrayList<Shelter> earthquake = ShelterLogin.earthquake;
        String temp = "";
        for (int i = 0; i < homeless.size(); i++) {
            temp += homeless.get(i).toString() + "\n";
        }
        String temp2 = "";
        for (int i = 0; i < hurricane.size(); i++) {
            temp2 += hurricane.get(i).toString() + "\n";
        }
        String temp3 = "";
        for (int i = 0; i < pet.size(); i++) {
            temp3 += pet.get(i).toString() + "\n";
        }
        String temp4 = "";
        for (int i = 0; i < earthquake.size(); i++) {
            temp4 += earthquake.get(i).toString() + "\n";
        }
        String print1 = "Homeless Shelters near you: \n\r";
        String print2 = "Hurricane Shelters near you: \n\r";
        String print3 = "Pet Shelters near you: \n\r";
        String print4 = "Earthquake Shelters near you: \n\r";

        textViewList.setText(print1 + temp + print2 + temp2 + print3 + temp3+ print4+ temp4);
    }
}
