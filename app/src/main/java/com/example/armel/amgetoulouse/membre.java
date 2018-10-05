package com.example.armel.amgetoulouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by said on 23/09/2017.
 */

public class membre extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.membre);
        // Locate the button in activity_main.xml
        Button Pre = (Button) findViewById(R.id.PREM);
        Button Photo=(Button) findViewById(R.id.PHOTO);
        Button ACC=(Button) findViewById(R.id.ACCM);
        Button CON =(Button) findViewById(R.id.CONM);
        Button ACT=(Button) findViewById(R.id.ACTM);




        Pre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(membre.this,
                        Presentation.class);
                startActivity(myIntent);
            }
        });


        Photo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(membre.this,
                        registration.class);
                startActivity(myIntent);
            }
        });



        ACC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(membre.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });



        ACT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(membre.this,
                        activite.class);
                startActivity(myIntent);
            }
        });
        CON.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(membre.this,
                        contact.class);
                startActivity(myIntent);
            }
        });
    }


}
