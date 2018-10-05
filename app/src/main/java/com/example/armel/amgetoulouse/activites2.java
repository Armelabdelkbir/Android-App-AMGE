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

public class activites2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activites3);
        // Locate the button in activity_main.xml
        //ImageButton aid = (ImageButton) findViewById(R.id.imageButton);
        ImageButton pres = (ImageButton) findViewById(R.id.PRES);
        ImageButton pot = (ImageButton) findViewById(R.id.POT);
        Button plus = (Button) findViewById(R.id.PLUS3);

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activites2.this,
                        activite3.class);
                startActivity(myIntent);
            }
        });


    }}