package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EnterHeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_height);
    }

    public void nextWeightActivity(View v){
        TextView height = findViewById(R.id.heightValue);
        TextView heightConstraint = findViewById(R.id.heightConstraint);
        TextView validHeight = findViewById(R.id.validHeight);
        if(height.length()!=0){
            if(Integer.parseInt(height.getText().toString())==0){
                validHeight.setText("Please, enter a valid value.");
                heightConstraint.setText("");
            }
            else{
                Intent intent = new Intent(v.getContext(), EnterWeightActivity.class);
                startActivity(intent);
            }
        }
        else{
            heightConstraint.setText("Please, enter your height.");
            validHeight.setText("");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), EnterAgeActivity.class);
        startActivity(intent);
    }
}
