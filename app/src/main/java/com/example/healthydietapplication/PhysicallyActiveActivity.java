package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhysicallyActiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physically_active);
    }

    public void nextActivityHome(View v){
        RadioButton choice1 = findViewById(R.id.choice1);
        RadioButton choice2 = findViewById(R.id.choice2);
        RadioButton choice3 = findViewById(R.id.choice3);
        RadioButton choice4 = findViewById(R.id.choice4);
        TextView constraint = findViewById(R.id.exerciseConstraint);

        if(choice1.isChecked() || choice2.isChecked() || choice3.isChecked() || choice4.isChecked()){
            Intent intent = new Intent(v.getContext(), HomeActivity.class);
            startActivity(intent);
        }
        else{
            constraint.setText("Please, choose one option.");
        }
    }
}
