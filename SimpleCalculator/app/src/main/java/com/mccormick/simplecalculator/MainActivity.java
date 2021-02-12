package com.mccormick.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView mNumberDisplay;
    private SimpleExpression calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumberDisplay = findViewById(R.id.textView);

        calculation = new SimpleExpression();
    }

    public void goAC (View view) {
        calculation.clearOperands();
        mNumberDisplay.setText("0");
    }

    public void goOperand (View view) {
        String val = (String) mNumberDisplay.getText();
        String digit = (String) view.getContentDescription();
        if (val.charAt(0) == '0')
            mNumberDisplay.setText(digit);
        else
            mNumberDisplay.setText((String) mNumberDisplay.getText() + digit.charAt(0));
    }

    public void goOperator (View view) {
        String operator = (String) view.getContentDescription();
        try {
            String val = (String) mNumberDisplay.getText();
            calculation.setOperand1(Integer.parseInt(val));
        } catch (NumberFormatException e){
            calculation.setOperand1(0);
        }
        mNumberDisplay.setText("0");
        calculation.setOperator(operator);
    }

    // WHEN THE = BUTTON IS CLICKED, COMPUTE AND DISPLAY THE VALUE
    public void goCompute (View view) {
        try {
            String val = (String) mNumberDisplay.getText();
            calculation.setOperand2((int) Integer.parseInt(val.toString()));
        }
        catch (NumberFormatException e){
            calculation.setOperand2(0);
        }
        mNumberDisplay.setText(calculation.getValue().toString());
    }
}