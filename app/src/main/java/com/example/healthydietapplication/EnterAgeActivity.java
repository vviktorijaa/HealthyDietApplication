package com.example.healthydietapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static android.util.Log.d;

public class EnterAgeActivity extends AppCompatActivity {

    public static int a;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_age);
    }

    public void nextActivity(View v){
        TextView age = findViewById(R.id.ageInput);
        TextView ageConstraint = findViewById(R.id.ageConstraint);
        TextView validAgeValue = findViewById(R.id.validAgeValue);

        if(age.length()!=0){
            if(Integer.parseInt(age.getText().toString())==0 || Integer.parseInt(age.getText().toString())>100){
                validAgeValue.setText("Please, enter a valid value.");
                ageConstraint.setText("");
            }
            else{
                a = Integer.parseInt(age.getText().toString());
                Intent intent = new Intent(v.getContext(), EnterHeightActivity.class);
                startActivity(intent);
            }
        }
        else{
            ageConstraint.setText("Please, enter your age.");
            validAgeValue.setText("");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), YourGenderActivity.class);
        startActivity(intent);
    }
}
