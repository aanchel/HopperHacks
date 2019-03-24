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

public class MainLogin extends AppCompatActivity {
    private Button donorOpt;
    private Button shelterOpt;
    private Button vicOpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ShelterLogin.addList();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        donorOpt = (Button) findViewById(R.id.donorOpt);
        shelterOpt = (Button) findViewById(R.id.shelterOpt);
        vicOpt = (Button) findViewById(R.id.vicOpt);

        donorOptFunctionality();
        shelterOptFunctionality();
        vicOptFunctionality();
    }
    private void donorOptFunctionality() {
        donorOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainLogin.this, ShelterNeedList.class));
            }
        });

    }
    private void shelterOptFunctionality() {
        shelterOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainLogin.this, ShelterLogin.class));
            }
        });


    }
    private void vicOptFunctionality() {
        vicOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainLogin.this, ShelterList.class));
            }
        });
    }
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
