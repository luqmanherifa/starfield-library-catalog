package com.luqman.uas.katalogstarfieldbuku;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread() {
            public void run() {
                try {
                    //berapalama splashscreen akan ditampilkan dalam milisecond
                    sleep(3000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                } finally {
                    //activity yang akan dijalankan setelah splashscreen selesai
                    Intent i = new Intent(ActivitySplash.this, ActivityMain.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }

}
