package com.example.healthydietapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity{

    int kcal=0;
    int userInputKcalToInt=0;
    int waterGlasses=0;
    int userInputWaterToInt=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        TextView maxKcal = findViewById(R.id.maxCalories);
        maxKcal.setText(String.valueOf(CalculateCalorieIntake.calculateMaxCalories()));
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
    }

    private void updateCaloriesProgressBar(){
        ProgressBar pb = findViewById(R.id.progressCalories);
        pb.setProgress((kcal*100)/CalculateCalorieIntake.calculateMaxCalories());
    }

    private void updateWaterProgressBar() {
        ProgressBar pb = findViewById(R.id.progressWater);
        pb.setProgress((waterGlasses * 100) / 8);
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
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void addWater(View v) {
        TextView consumedWater = findViewById(R.id.consumedWater);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("How many glasses of water did you drink? Note: The glass size is 250ml.");

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
            }
        });
        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        alert.show();
    }

    public void undoKcal(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Are you sure you want to undo the last added consumed calories?");

        alert.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                TextView consumedKcal = findViewById(R.id.consumedCalories);

                kcal-=userInputKcalToInt;
                consumedKcal.setText(String.valueOf(kcal));
                updateCaloriesProgressBar();
            }
        });
        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        alert.show();
    }

    public void undoWater(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Are you sure you want to undo the last added consumed water?");

        alert.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                TextView consumedWater = findViewById(R.id.consumedWater);

                waterGlasses-=userInputWaterToInt;
                consumedWater.setText(String.valueOf(waterGlasses));
                updateWaterProgressBar();

            }
        });
        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        alert.show();
    }
}
