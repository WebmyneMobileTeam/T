package com.webmyne.tisco;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Launcher extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        new CountDownTimer(00, 1000) {

            @Override
            public void onFinish() {

                Intent i = new Intent(Launcher.this,HomeActivity.class);
                startActivity(i);


            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();
    }



}
