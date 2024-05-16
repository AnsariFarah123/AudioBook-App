package com.example.audiobook_app.Screens;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audiobook_app.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forget_password);
<<<<<<< Updated upstream
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
               WindowManager.LayoutParams.FLAG_FULLSCREEN);
       findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { ForgetPasswordActivity.super.onBackPressed();}
       });
=======
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) { ForgetPasswordActivity.super.onBackPressed();}
    });
>>>>>>> Stashed changes
    }
}