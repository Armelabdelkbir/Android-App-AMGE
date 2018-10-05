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

public class activite1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activites2);
        // Locate the button in activity_main.xml
        ImageButton jour = (ImageButton) findViewById(R.id.JOUR);
        ImageButton cafe = (ImageButton) findViewById(R.id.CAF);
        ImageButton chasse = (ImageButton) findViewById(R.id.CHAS);
        Button plus = (Button) findViewById(R.id.PLUS2);
        Button prec =(Button)findViewById(R.id.Prec2);
        prec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite1.this,
                        activite.class);
                startActivity(myIntent);
                activite1.this.finish();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite1.this,
                        activites3.class);
                startActivity(myIntent);
                activite1.this.finish();
            }
        });
        jour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite1.this,
                        Journe.class);
                startActivity(myIntent);
                activite1.this.finish();
            }
        });
        cafe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite1.this,
                        cafe.class);
                startActivity(myIntent);
                activite1.this.finish();
            }
        });
        chasse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite1.this,
                        chasse.class);
                startActivity(myIntent);
                activite1.this.finish();
            }
        });


    }}