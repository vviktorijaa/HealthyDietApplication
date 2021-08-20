package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EnterWeightActivity extends AppCompatActivity {

    public static double w;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_weight);
    }

    public void nextActivity(View v){
        TextView weight = findViewById(R.id.enterWeight);
        TextView weightConstraint = findViewById(R.id.weightConstraint);
        TextView validWeight = findViewById(R.id.enterValidWeight);
        if(weight.length()!=0){
            if(Integer.parseInt(weight.getText().toString())==0){
                validWeight.setText("Please, enter a valid value.");
                weightConstraint.setText("");
            }
            else{
                w = Double.parseDouble(weight.getText().toString());
                Intent intent = new Intent(v.getContext(), ChooseYourGoalActivity.class);
                startActivity(intent);
            }
        }
        else{
            weightConstraint.setText("Please, enter your weight.");
            validWeight.setText("");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), EnterHeightActivity.class);
        startActivity(intent);
    }
}
