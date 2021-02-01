package com.mccormick.lab3ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String createMsg;
    private String startMsg;
    private String resumeMsg;
    private String pauseMsg;
    private String stopMsg;
    private String restartMsg;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeMessages();
        Toast.makeText(this, createMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, createMsg);
    }

    private void initializeMessages(){
        createMsg = (String) getResources().getText(R.string.create_message);
        startMsg = (String) getResources().getText(R.string.start_message);
        resumeMsg = (String) getResources().getText(R.string.resume_message);
        pauseMsg = (String) getResources().getText(R.string.pause_message);
        stopMsg = (String) getResources().getText(R.string.stop_message);
        restartMsg = (String) getResources().getText(R.string.restart_message);
        msg = "Activity callbacks ";
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, startMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, startMsg);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, resumeMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, resumeMsg);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, pauseMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, pauseMsg);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, stopMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, stopMsg);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, restartMsg, Toast.LENGTH_LONG).show();
        Log.d(msg, restartMsg);
    }

}