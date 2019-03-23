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
        finish();
        startActivity(new Intent(MainLogin.this, ShelterList.class));
    }
    private void shelterOptFunctionality() {

    }
    private void vicOptFunctionality() {

    }
}
