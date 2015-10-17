package com.sampath.akshay.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Akshay on 2015-09-19.
 */
public class ColourWheel {

    public String[] mColours = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //Method (abilities: things the object can do)
    public int getColour(){
        String colour = "";
        int colourAsInt = 0;
        //randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator
        int randNum = randomGenerator.nextInt(mColours.length);

        colour = mColours[randNum];
        colourAsInt = Color.parseColor(colour);
        //Handy way to convert Hexadecimal string to the integer representation

        return colourAsInt;
    }
}
