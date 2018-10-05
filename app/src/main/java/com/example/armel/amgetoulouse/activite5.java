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

public class activite5 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activites5);
        // Locate the button in activity_main.xml
        ImageButton pool = (ImageButton) findViewById(R.id.POOL);
        ImageButton letg = (ImageButton) findViewById(R.id.LET);
        ImageButton entr1 = (ImageButton) findViewById(R.id.ENTR);
        Button acc6 = (Button) findViewById(R.id.acc6);
        Button prec =(Button)findViewById(R.id.Prec5);
        prec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite5.this,
                        active4.class);
                startActivity(myIntent);
                activite5.this.finish();
            }
        });
        acc6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite5.this,
                        MainActivity.class);
                startActivity(myIntent);
                activite5.this.finish();
            }
        });
        pool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite5.this,
                        pool.class);
                startActivity(myIntent);
                activite5.this.finish();
            }
        });
        letg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite5.this,
                        let.class);
                startActivity(myIntent);
                activite5.this.finish();
            }
        });
        entr1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(activite5.this,
                        entr.class);
                startActivity(myIntent);
                activite5.this.finish();
            }
        });

    }}