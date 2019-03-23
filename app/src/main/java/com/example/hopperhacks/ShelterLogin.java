package com.example.hopperhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class ShelterLogin extends AppCompatActivity {
    private EditText shelterName;
    private EditText shelterEmail;
    private EditText shelterNeed;
    private EditText shelterDist;
    private EditText shelterType;
    private EditText shelterLoc;
    private Button shelterSend;
    private Button viewShelterList;


    public static ArrayList<Shelter> unsorted = new ArrayList<Shelter>();
    public static ArrayList<Shelter> homeless = new ArrayList<Shelter>();
    public static ArrayList<Shelter> hurricane = new ArrayList<Shelter>();
    public static ArrayList<Shelter> pet = new ArrayList<Shelter>();
    public static ArrayList<Shelter> earthquake = new ArrayList<Shelter>();
    public static ArrayList<Shelter> food = new ArrayList<Shelter>();
    public static ArrayList<Shelter> toiletries = new ArrayList<Shelter>();
    public static ArrayList<Shelter> blankets = new ArrayList<Shelter>();
    public static ArrayList<Shelter> water = new ArrayList<Shelter>();
    public static ArrayList<Shelter> clothes = new ArrayList<Shelter>();

    public static void printList() {
        Shelter a = new Shelter(5, "Cupertino, California", "homeless", "food", "Bil Wilson Center");
        unsorted.add(a);
        Shelter b = new Shelter(10, "Sunnyvale, California", "homeless", "toiletries", "Sunnyvale County Winter Shelter");
        unsorted.add(b);
        Shelter c = new Shelter(15, "Fremont, California", "homeless", "blankets", "Cityteam");
        unsorted.add(c);
        Shelter d = new Shelter(20, "San Jose, California", "homeless", "water", "LiveMoves");
        unsorted.add(d);
        Shelter e = new Shelter(25, "San Francisco, California", "homeless", "clothes", "Heritage Home");
        unsorted.add(e);
        Shelter f = new Shelter(5, "Cupertino, California", "hurricane", "clothes", "Rescue Wing");
        unsorted.add(f);
        Shelter g = new Shelter(10, "Sunnyvale, California", "hurricane", "water", "Emergency Management");
        unsorted.add(g);
        Shelter h = new Shelter(15, "Fremont, California", "hurricane", "blankets", "CERT USA");
        unsorted.add(h);
        Shelter i2 = new Shelter(20, "San Jose, California", "hurricane", "toiletries", "Hurricane Shelter");
        unsorted.add(i2);
        Shelter j = new Shelter(25, "San Francisco, California", "hurricane", "food", "Safe shelter");
        unsorted.add(j);
        Shelter k = new Shelter(5, "Cupertino, California", "pet", "blankets", "Care Companion");
        unsorted.add(k);
        Shelter l = new Shelter(10, "Sunnyvale, California", "pet", "water", "Safe Haven Animal Sanctuary");
        unsorted.add(l);
        Shelter m = new Shelter(15, "Fremont, California", "pet", "blankets", "Humane Society");
        unsorted.add(m);
        Shelter n = new Shelter(20, "San Jose, California", "pet", "food", "Cat Rescue");
        unsorted.add(n);
        Shelter o = new Shelter(25, "San Francisco, California", "pet", "food", "Pets In Need");
        unsorted.add(o);
        Shelter p = new Shelter(5, "Cupertino, California", "earthquake", "water", "Quake Safe");
        unsorted.add(p);
        Shelter q = new Shelter(10, "Sunnyvale, California", "earthquake", "clothes", "Disaster Free");
        unsorted.add(q);
        Shelter r = new Shelter(15, "Fremont, California", "earthquake", "toiletries", "Shake Shelter");
        unsorted.add(r);
        Shelter s = new Shelter(20, "San Jose, California", "earthquake", "food", "Earthquake Shelter");
        unsorted.add(s);
        Shelter t = new Shelter(25, "San Francisco, California", "earthquake", "blankets", "Emergency Shelter");
        unsorted.add(t);

        sortIntoTypes(unsorted);
        //sortIntoNeeds(unsorted);
        insertionSort(homeless);
        insertionSort(hurricane);
        insertionSort(pet);
        insertionSort(earthquake);
        insertionSort(food);
        insertionSort(toiletries);
        insertionSort(blankets);
        insertionSort(water);
        insertionSort(clothes);
        System.out.println("Homeless Shelters near you: \n");
        for (int i = 0; i < homeless.size(); i++) {
            System.out.print("\t" + homeless.get(i).toString());
        }
        System.out.println("Hurricane Shelters near you: \n");
        for (int i = 0; i < hurricane.size(); i++) {
            System.out.print("\t" + hurricane.get(i).toString());
        }
        System.out.println("Pet Shelters near you: \n");
        for (int i = 0; i < pet.size(); i++) {
            System.out.print("\t" + pet.get(i).toString());
        }
        System.out.println("Earthquake Shelters near you: \n");
        for (int i = 0; i < earthquake.size(); i++) {
            System.out.print("\t" + earthquake.get(i).toString());
        }

    }

    public static void sortIntoTypes(ArrayList<Shelter> types) {
        for (int i = 0; i < types.size(); i++) {
            if (types.get(i).getType().equals("homeless")) {
                homeless.add(types.get(i));
            }
            if (types.get(i).getType().equals("hurricane")) {
                hurricane.add(types.get(i));
            }
            if (types.get(i).getType().equals("pet")) {
                pet.add(types.get(i));
            }
            if (types.get(i).getType().equals("earthquake")) {
                earthquake.add(types.get(i));
            }
        }
    }

    public static void insertionSort(ArrayList<Shelter> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Shelter temp = arr.get(i);
            boolean shift = false;
            for (int j = i - 1; j >= 0; j--) {
                if (temp.compareTo(arr.get(j)) < 0) {
                    arr.set(j + 1, arr.get(j));
                    shift = true;
                } else {
                    if (shift)
                        arr.set(j + 1, temp);
                    break;
                }
                if (j == 0 && shift)
                    arr.set(j, temp);
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        */
        shelterType = (EditText) findViewById(R.id.shelterType);
        shelterName = (EditText) findViewById(R.id.shelterName);
        shelterLoc = (EditText) findViewById(R.id.shelterLoc);
        shelterDist = (EditText) findViewById(R.id.shelterDist);
        shelterNeed = (EditText) findViewById(R.id.shelterNeed);
        shelterSend = (Button) findViewById(R.id.shelterSend);
        viewShelterList = (Button) findViewById(R.id.viewShelterList);

        shelterSendFunctionality();
        viewShelterListFunctionality();
    }
    private void viewShelterListFunctionality() {
        viewShelterList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(ShelterLogin.this, ShelterList.class));
            }
        });
    }
    private void shelterSendFunctionality() {
        shelterSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = shelterType.getText().toString().trim();
                String name = shelterName.getText().toString().trim();
                String location = shelterLoc.getText().toString().trim();
                long dist = Long.parseLong(shelterDist.getText().toString().trim());
                String needs = shelterNeed.getText().toString().trim();

                Shelter newShelter = new Shelter(dist, location, type, needs, name);
                unsorted.add(newShelter);


            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view){
        //placeholder
    }
}