package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhysicallyActiveActivity extends AppCompatActivity {

    public static boolean noActivity;
    public static boolean onceAWeek;
    public static boolean oneToThreeTimesAWeek;
    public static boolean moreThanThreeTimesAWeek;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physically_active);
    }

    public void nextActivityKcalBmi(View v){
        RadioButton choice1 = findViewById(R.id.choice1);
        RadioButton choice2 = findViewById(R.id.choice2);
        RadioButton choice3 = findViewById(R.id.choice3);
        RadioButton choice4 = findViewById(R.id.choice4);
        TextView constraint = findViewById(R.id.exerciseConstraint);

        if(choice1.isChecked() || choice2.isChecked() || choice3.isChecked() || choice4.isChecked()){
            checkWhatIsChecked();
            Intent intent = new Intent(v.getContext(), RecommendedKcalBMIActivity.class);
            startActivity(intent);
        }
        else{
            constraint.setText("Please, choose one option.");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), ChooseYourGoalActivity.class);
        startActivity(intent);
    }

    private void checkWhatIsChecked(){
        RadioButton choice1 = findViewById(R.id.choice1);
        RadioButton choice2 = findViewById(R.id.choice2);
        RadioButton choice3 = findViewById(R.id.choice3);

        if(choice1.isChecked()){
            noActivity = true;
        }
        else if(choice2.isChecked()){
            onceAWeek = true;
        }
        else if(choice3.isChecked()){
            oneToThreeTimesAWeek = true;
        }
        else{
            moreThanThreeTimesAWeek = true;
        }
    }
}
