package com.sampath.akshay.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;



public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColourWheel mColourWheel = new ColourWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables (button and text) and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int colour = mColourWheel.getColour();
                factLabel.setText(fact); //This sets the fact label above to the new fact (final)
                relativeLayout.setBackgroundColor(colour);
                showFactButton.setTextColor(colour);
            }
        };
        showFactButton.setOnClickListener(listener); //Attach the OnClickListener to the button

        //String message = "The Fun Facts Activity has been created.";
        //Toast toastMessage = Toast.makeText(this, message, Toast.LENGTH_LONG);
        //toastMessage.show();

        Log.d(TAG, "We're logging from the OnCreate Method");

    }
}
