package com.mccormick.burgercalorie;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.Window;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TASK 1: DECLARE Ui OBJECTS TO BE REFERENCED
    private RadioGroup pattyRG;
    private CheckBox onionCBX;
    private RadioGroup cheeseRG;
    private SeekBar sauceSBR;
    private TextView caloriesTV;

    // TASK 2: DECLARE VARIABLES FOR COMPUTING CALORIES
    private Burger burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TASK 3: INITIALIZE UI OBJECTS AND VARIABLES
        burger = new Burger();
        initialize();

        // TASK 4: REGISTER CHANGE LISTENERS
        registerChangeListener();
    }

    private void initialize(){
        // TASK 5: GET REFERENCE TO EACH OF THE Ui COMPONENTS
        pattyRG = findViewById(R.id.radioGroup);
        onionCBX = findViewById(R.id.checkBox);
        cheeseRG = findViewById(R.id.radioGroup2);
        sauceSBR = findViewById(R.id.seekBar);
        caloriesTV = findViewById(R.id.textView3);

        displayCalories();
    }

    private void registerChangeListener(){
        pattyRG.setOnCheckedChangeListener(foodListener);
        onionCBX.setOnClickListener(onionListener);
        cheeseRG.setOnCheckedChangeListener(foodListener);
        sauceSBR.setOnSeekBarChangeListener(sauceListener);
    }

    private OnCheckedChangeListener foodListener = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //System.out.println(""+ checkedId);
            switch(checkedId){
                case 2131230976: // BLACK BEAN PATTY
                    burger.setPattyCalories(Burger.BEAN);
                    break;
                case 2131230977: // BEYOND PATTY
                    burger.setPattyCalories(Burger.BEYOND);
                    break;
                case 2131230978: // PORTABELLO PATTY
                    burger.setPattyCalories(Burger.PORTA);
                    break;
                case 2131230980: // CHEDDAR CHEESE
                    burger.setCheeseCalories(Burger.CHEESE);
                    break;
                case 2131230979: // AVOCADO
                    burger.setCheeseCalories(Burger.AVO);
                    break;
            }
            displayCalories();
        }
    };

    private OnClickListener onionListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (((CheckBox) v).isChecked())
                burger.setOnionsCal(Burger.ONIONS);
            else
                burger.clearOnionsCal();
        }
    };

    private OnSeekBarChangeListener sauceListener = new OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            burger.setSauceCalories(seekBar.getProgress());
            displayCalories();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };

    private void displayCalories(){
        // CONSTRUCT AN OUTPUT STRING AND DISPLAY IN THE TEXTVIEW
        String calorieTxt = "Calories: " + burger.getTotalCalories();
        caloriesTV.setText(calorieTxt);
    }
}