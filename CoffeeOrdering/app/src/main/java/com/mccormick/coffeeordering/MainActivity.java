package com.mccormick.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CoffeeOrder order;
    private TextView quantityView;
    private TextView summaryView;
    private Button minusBtn;
    private Button plusBtn;
    private Button orderBtn;
    private CheckBox creamBox;
    private CheckBox chocBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order = new CoffeeOrder();
        quantityView = findViewById(R.id.quantTxtView);
        summaryView = findViewById(R.id.orderSumTxtView);
    }
}