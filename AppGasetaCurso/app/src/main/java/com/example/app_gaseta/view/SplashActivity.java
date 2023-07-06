package com.example.app_gaseta.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_gaseta.R;
import com.example.app_gaseta.database.Gaseta_DB;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        cumutarTelaSplash();
    }

    private void cumutarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Gaseta_DB db = new Gaseta_DB(SplashActivity.this);

                Intent telaPrincipal = new Intent(SplashActivity.this, GasetaActivity.class);
                startActivity(telaPrincipal);
                finish();
            }
        }, TIME_OUT_SPLASH);
    }
}