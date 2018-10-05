package com.example.armel.amgetoulouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.armel.amgetoulouse.R.layout.activites4;


/**
 * Created by armel on 9/17/2017.
 */

public class active4 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(activites4);
        // Locate the button in activity_main.xml
        ImageButton dvp = (ImageButton) findViewById(R.id.DVP);
        ImageButton voy = (ImageButton) findViewById(R.id.VOY);
        ImageButton orion = (ImageButton) findViewById(R.id.ORIO);
        Button plus = (Button) findViewById(R.id.PLUS4);
        Button prec =(Button)findViewById(R.id.Prec4);
        prec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(active4.this,
                        activites3.class);
                startActivity(myIntent);
                active4.this.finish();
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(active4.this,
                        activite5.class);
                startActivity(myIntent);
                active4.this.finish();
            }
        });
        dvp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(active4.this,
                        dvp.class);
                startActivity(myIntent);
                active4.this.finish();

            }
        });
        voy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(active4.this,
                        voy.class);
                startActivity(myIntent);
                active4.this.finish();
            }
        });
        orion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(active4.this,
                        orio.class);
                startActivity(myIntent);
                active4.this.finish();
            }
        });

    }}