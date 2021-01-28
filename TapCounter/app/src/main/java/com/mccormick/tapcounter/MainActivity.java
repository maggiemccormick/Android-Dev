package com.mccormick.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

// **************CONTROLLER CLASS*******************
public class MainActivity extends AppCompatActivity {
    // 1. REFERENCE DATA MODELS AND VIEWS
    private Counter count;
    private TextView countTxView;
    private Button tapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. CREATE THE DATA MODEL
        count = new Counter();

        // 3. REFERENCE THE VIEWS
        countTxView = (TextView) findViewById(R.id.textView);
        tapBtn = (Button) findViewById(R.id.button);

        // 4. REGISTER A LISTENER EVENT FOR THE BUTTON - USE A HANDLER
        tapBtn.setOnClickListener(updateCounter);
    }

    // 5. HANDLER - updateCounter()
    private View.OnClickListener updateCounter = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            count.addCount();
            countTxView.setText(count.getCount().toString());
        }

    };





}