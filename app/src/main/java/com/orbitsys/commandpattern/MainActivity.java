package com.orbitsys.commandpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stock abcStock=new Stock();
        BuyStock buyStock=new BuyStock(abcStock);
        SellStock sellStock=new SellStock(abcStock);
        Broker broker=new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}