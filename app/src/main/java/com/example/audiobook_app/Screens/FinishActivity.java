package com.example.audiobook_app.Screens;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audiobook_app.R;

public class FinishActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_finish);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sharedPreferences = getSharedPreferences("myData",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if(sharedPreferences.getString("finishStatus","").equals("true")){
            startActivity(new Intent(FinishActivity.this, DashboardActivity.class));
            finish();
        }


        findViewById(R.id.finishbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("finishStatus","true");
                editor.commit();
                startActivity(new Intent(FinishActivity.this,DashboardActivity.class));
            }
        });


    }
}