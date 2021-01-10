package com.orbitsys.commandpattern;

import android.util.Log;

public class Stock {
    public static final String TAG="@@@";
    private String name="ABC";
    private int quantity=10;
    public void buy(){
        Log.d(TAG, "Stock Name "+name+" Quantity: " +quantity+" ] bought");
    }
    public void sell(){
        Log.d(TAG, "Stock Name "+name+" Quantity: " +quantity+" ] bought");
    }

}
