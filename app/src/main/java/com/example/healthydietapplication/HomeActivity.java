package com.example.healthydietapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    int kcal=0;
    int userInputKcalToInt=0;
    int waterGlasses=0;
    int userInputWaterToInt=0;
    int maxKcal=2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void myProfileActivity(View v) {
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipesActivity(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void settingsActivity(View v) {
        Intent intent = new Intent(v.getContext(), HomeSettingsActivity.class);
        startActivity(intent);
    }

    public void info1Activity(View v) {
        Intent intent = new Intent(v.getContext(), Info1Activity.class);
        startActivity(intent);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent start = new Intent(v.getContext(), Info1Activity.class);
//                startActivity(start);
//                finish();
//            }
//        }, 5000);
    }

    private void updateCaloriesProgressBar(){
        ProgressBar pb = findViewById(R.id.progressCalories);
        pb.setProgress((kcal*100)/2000);
    }

    private void updateWaterProgressBar(){
        ProgressBar pb = findViewById(R.id.progressWater);
        pb.setProgress((waterGlasses*100)/8);
    }

    public void addCalories(View v) {
        TextView consumedKcal = findViewById(R.id.consumedCalories);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Add calories");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    userInputKcalToInt = Integer.parseInt(input.getText().toString());
                    kcal += userInputKcalToInt;
                    consumedKcal.setText(String.valueOf(kcal));
                    updateCaloriesProgressBar();
                }
                else{
                    //EmptyStringException e = new EmptyStringException("Please, enter calories.");
                }
            }
        });

        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        alert.show();
    }

    public void addWater(View v) {
        TextView consumedWater = findViewById(R.id.consumedWater);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("How many glasses of water did you drink?");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    userInputWaterToInt = Integer.parseInt(input.getText().toString());
                    waterGlasses += userInputWaterToInt;
                    consumedWater.setText(String.valueOf(waterGlasses));
                    updateWaterProgressBar();
                }
                else{
                    EmptyStringException e = new EmptyStringException("Please, enter calories.");
                }
            }
        });
        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();
    }
}
