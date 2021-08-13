package com.example.healthydietapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile_activity);

        //Context context =this;

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String userstring =  sp.getString("Username",null);

//        SharedPreferences preferences = getSharedPreferences("database", Context.MODE_PRIVATE);
//        String displayUsername = preferences.getString("Username", null);

        TextView username = findViewById(R.id.userName);
        username.setText(userstring);
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
