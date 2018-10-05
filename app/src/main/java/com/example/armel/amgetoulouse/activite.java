package com.example.armel.amgetoulouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by armel on 9/13/2017.
 */

public class activite extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activites);
        // Locate the button in activity_main.xml
        ImageButton aid = (ImageButton) findViewById(R.id.AID);
        ImageButton pres = (ImageButton) findViewById(R.id.PRES);
        ImageButton pot = (ImageButton) findViewById(R.id.POT);
        Button plus = (Button) findViewById(R.id.PLUS1);
        Button prec =(Button)findViewById(R.id.Prec1);
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite.this,
                        activite1.class);
                startActivity(myIntent);
                activite.this.finish();
            }
        });
        prec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite.this,
                        visiteur.class);
                startActivity(myIntent);
                activite.this.finish();
            }
        });
        aid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite.this,
                        Aidkbir.class);
                startActivity(myIntent);
                activite.this.finish();
            }
        });
        pres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite.this,
                        PRES.class);
                startActivity(myIntent);
                activite.this.finish();
            }
        });
        pot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite.this,
                        POT.class);
                startActivity(myIntent);
                activite.this.finish();
            }
        });


    }}