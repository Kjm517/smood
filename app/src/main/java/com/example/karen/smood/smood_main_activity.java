package com.example.karen.smood;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import io.ghyeok.stickyswitch.widget.StickySwitch;

public class smood_main_activity extends AppCompatActivity {

    private TextView mTextTimeCountDown;
    private Handler handler;

    private static final long start_timer = 60000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smood_main_activity);

        StickySwitch stickySwitch = (StickySwitch)findViewById(R.id.stick_switch);
        stickySwitch.setOnSelectedChangeListener(new StickySwitch.OnSelectedChangeListener() {
            @Override
            public void onSelectedChange(StickySwitch.Direction direction, String s) {
                Toast.makeText(getBaseContext(), "Now Selected: " + s, Toast.LENGTH_SHORT ).show();
            }
        });

        handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d("Timer", "Run timer was called here");
                handler.postDelayed(this, 1000);
            }
        };

        handler.postDelayed(runnable, 1000);

    }

    class MyRunnable implements Runnable{

        @Override
        public void run() {

        }
    }
}
