package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.healthydietapplication.databinding.ActivityMainBinding;

public class YourGenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_gender);
    }

    public void nextActivity(View v){
        RadioButton maleRadioButton = findViewById(R.id.radioButtonMale);
        RadioButton femaleRadioButton = findViewById(R.id.radioButtonFemale);
        RadioButton notTell = findViewById(R.id.radioButtonNotTell);
        TextView text = findViewById(R.id.genderConstraint);
        if(maleRadioButton.isChecked() || femaleRadioButton.isChecked() || notTell.isChecked()){
            Intent intent = new Intent(v.getContext(), EnterAgeActivity.class);
            startActivity(intent);
        }
        else{
            text.setText("Please, choose one option.");
        }
    }

    public void previousActivity(View v){
        Intent intent = new Intent(v.getContext(), MainActivity.class);
        startActivity(intent);
    }
}
