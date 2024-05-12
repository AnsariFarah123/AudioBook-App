package Screens;

import android.os.Bundle;
<<<<<<< Updated upstream:app/src/main/java/Screens/ErrorActivity.java
import android.view.View;
=======
>>>>>>> Stashed changes:app/src/main/java/Screens/DashboardActivity.java
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.audiobook_app.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
<<<<<<< Updated upstream:app/src/main/java/Screens/ErrorActivity.java
        setContentView(R.layout.activity_error);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
      findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view) { ErrorActivity.super.onBackPressed();}
      });

=======
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
>>>>>>> Stashed changes:app/src/main/java/Screens/DashboardActivity.java
    }
}


