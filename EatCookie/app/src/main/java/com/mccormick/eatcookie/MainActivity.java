package com.mccormick.eatcookie;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // Reference data models and views
    private TextView textView;
    private Button tapBtn;
    private ImageView imageView;
    private CookieMonster change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference the views and model
        textView = (TextView) findViewById(R.id.textView);
        tapBtn = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        change = new CookieMonster();

        // Register a listener event for the button
        tapBtn.setOnClickListener(updateScreen);
    }

    // Handler for button
    private View.OnClickListener updateScreen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            change.changeStatus();
            if(change.getStatus()) {
                imageView.setImageResource(R.mipmap.hungry);
                textView.setText(R.string.hungry);
                tapBtn.setText(R.string.btn_eat);
            } else {
                imageView.setImageResource(R.mipmap.full);
                textView.setText(R.string.full);
                tapBtn.setText(R.string.btn_full);
            }
        }
    };
}