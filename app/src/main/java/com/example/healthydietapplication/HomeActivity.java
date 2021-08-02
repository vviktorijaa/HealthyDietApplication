package com.example.healthydietapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private String kcal;

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


    public void addCalories(View v) {
        TextView consumedCalories = findViewById(R.id.consumCalories);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Add calories");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        //margin
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
//                if (!(input.getText().toString().matches(""))) {
//                    kcal = input.getText().toString();
//                    consumedCalories.setText(kcal);
//                }
            }
        });

        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });

        alert.show();
    }

    public void addWater(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Add water");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        //margin
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();
    }
}
