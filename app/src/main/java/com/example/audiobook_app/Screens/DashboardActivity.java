package com.example.audiobook_app.Screens;

import static android.os.Build.VERSION_CODES.R;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;

import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audiobook_app.R;

public class DashboardActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sharedPreferences = getSharedPreferences("myData",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        MainActivity.checkStatus(DashboardActivity.this);

        if(!sharedPreferences.contains("loginStatus")){
            startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
            finish();
        }

        findViewById(R.id.seeMoreBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SeeMoreActivity.class));
            }
        });

        findViewById(R.id.settingBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SettingsActivity.class));
            }
        });
    }
}


