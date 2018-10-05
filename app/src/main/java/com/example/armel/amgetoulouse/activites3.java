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
 * Created by armel on 9/17/2017.
 */

public class activites3 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activites3);
        // Locate the button in activity_main.xml
        //ImageButton aid = (ImageButton) findViewById(R.id.imageButton);
        ImageButton tra = (ImageButton) findViewById(R.id.TRA);
        ImageButton walibi = (ImageButton) findViewById(R.id.WAL);
        ImageButton caf = (ImageButton) findViewById(R.id.CAF2);
        Button plus = (Button) findViewById(R.id.PLUS3);
        Button prec =(Button)findViewById(R.id.Prec3);
        prec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites3.this,
                        activite1.class);
                startActivity(myIntent);
                activites3.this.finish();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites3.this,
                        active4.class);
                startActivity(myIntent);
                activites3.this.finish();
            }
        });

        caf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites3.this,
                        cafe2.class);
                startActivity(myIntent);
                activites3.this.finish();
            }
        });
        walibi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites3.this,
                        walibi.class);
                startActivity(myIntent);
                activites3.this.finish();
            }
        });
        tra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites3.this,
                        tra.class);
                startActivity(myIntent);
                activites3.this.finish();
            }
        });


    }}