package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChooseYourGoalActivity extends AppCompatActivity {

    public static boolean loseWeight;
    public static boolean maintainWeight;
    public static boolean gainWeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_goal);
    }

    public void nextActivity(View v){
        TextView textChooseGoal = findViewById(R.id.chooseGoal);
        RadioButton gain = findViewById(R.id.gainWeight);
        RadioButton maintain = findViewById(R.id.maintainWeight);
        RadioButton lose = findViewById(R.id.loseWeight);

        if(gain.isChecked() || maintain.isChecked() || lose.isChecked()){
            checkWhatIsChecked();
            Intent intent = new Intent(v.getContext(), PhysicallyActiveActivity.class);
            startActivity(intent);
        }
        else{
            textChooseGoal.setText("Please, choose one option.");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), EnterWeightActivity.class);
        startActivity(intent);
    }

    public void checkWhatIsChecked(){
        RadioButton gain = findViewById(R.id.gainWeight);
        RadioButton maintain = findViewById(R.id.maintainWeight);

        if(gain.isChecked()){
            gainWeight = true;
        }
        else if(maintain.isChecked()){
            maintainWeight = true;
        }
        else{
            loseWeight = true;
        }
    }
}
