package com.example.armel.amgetoulouse;

/**
 * Created by armel on 7/27/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


/**
 * Created by armel on 7/20/2017.
 */

public class visiteur extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.visiteur);
        // Locate the button in activity_main.xml
        Button Pre = (Button) findViewById(R.id.PRE);
        Button REG=(Button) findViewById(R.id.REG);
        Button ACC=(Button) findViewById(R.id.ACCM);
        Button CON =(Button) findViewById(R.id.CON);
        Button ACT=(Button) findViewById(R.id.ACT);




       Pre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(visiteur.this,
                        Presentation.class);
                startActivity(myIntent);
            }
        });


        REG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(visiteur.this,
                        registration.class);
                startActivity(myIntent);
            }
        });



        ACC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(visiteur.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });



        ACT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(visiteur.this,
                        activite.class);
                startActivity(myIntent);
            }
        });
        CON.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(visiteur.this,
                        contact.class);
                startActivity(myIntent);
            }
        });
       }


}


