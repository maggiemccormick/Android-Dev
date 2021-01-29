package com.mccormick.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // MODEL
    private CoffeeOrder order;

    //VIEWS
    private TextView quantityView;
    private TextView summaryView;
    private CheckBox chocCheck;
    private CheckBox creamCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order = new CoffeeOrder();

        quantityView = findViewById(R.id.quantTxtView);
        summaryView = findViewById(R.id.orderSumTxtView);
        chocCheck = findViewById(R.id.checkBoxChocolate);
        creamCheck = findViewById(R.id.checkBoxCream);
    }
    public void setChoc(View view){
        order.changeChoc(chocCheck.isChecked());
    }

    public void setCream(View view){
        order.changeCream(creamCheck.isChecked());
    }

    public void increment(View view){
        order.addCoffee();
        quantityView.setText(order.getQuantityString());
    }

    public void decrement(View view){
        order.subtractCoffee();
        quantityView.setText(order.getQuantityString());
    }

    public void computeOrder(View view){
        summaryView.setText(order.getOrderSummary());
    }
}