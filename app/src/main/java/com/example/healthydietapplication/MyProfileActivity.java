package com.example.healthydietapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile_activity);

        TextView userName = findViewById(R.id.userName);
        TextView userHeight = findViewById(R.id.userHeight);
        TextView userWeight = findViewById(R.id.userWeight);
        TextView userBMI = findViewById(R.id.userBMI);

        userName.setText(MainActivity.username);
        userHeight.setText(String.valueOf(EnterHeightActivity.h));
        userWeight.setText(String.valueOf(EnterWeightActivity.w));
        userBMI.setText(String.valueOf(CalculateBMI.calculate()));
    }

    public void homeActivity(View v){
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void recipesActivity(View v){
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void profileSettings(View v){
        Intent intent = new Intent(v.getContext(), ProfileSettingsActivity.class);
        startActivity(intent);
    }
}
