package com.example.armel.amgetoulouse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by armel on 9/13/2017.
 */

public class PRES extends Activity{ protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.pres);
    Button suiv = (Button)findViewById(R.id.plus2);
    suiv.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {

            // Start NewActivity.class
            Intent myIntent = new Intent(PRES.this,
                    Journe.class);
            startActivity(myIntent);
            PRES.this.finish();
        }
    });
}
}
