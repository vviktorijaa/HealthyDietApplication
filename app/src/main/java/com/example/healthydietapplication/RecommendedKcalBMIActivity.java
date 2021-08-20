package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecommendedKcalBMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommended_kcal_bmi_activity);

        TextView userBmi = findViewById(R.id.userBmi);
        TextView userMaxKcal = findViewById(R.id.userRecommendedKcal);
        userMaxKcal.setText((String.valueOf(CalculateCalorieIntake.calculateMaxCalories())));
        userBmi.setText((String.valueOf(CalculateBMI.calculate())));
    }

    public void NextHomeActivity(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void previousPhysicallyActiveActivity(View v){
        Intent intent = new Intent(v.getContext(), PhysicallyActiveActivity.class);
        startActivity(intent);
    }
}
