package com.example.armel.amgetoulouse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by said on 23/09/2017.
 */

public class cafe2 extends Activity {protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.cafe2);
    Button suiv = (Button)findViewById(R.id.plusc);
    suiv.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {

            // Start NewActivity.class
            Intent myIntent = new Intent(cafe2.this,
                    dvp.class);
            startActivity(myIntent);
            cafe2.this.finish();
        }
    });
}

}
