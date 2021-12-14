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

public class ProfileSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_settings);
    }

    public void homeActivity(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void myProfileActivity(View v) {
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipesActivity(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void logout(View v) {
        Intent intent = new Intent(v.getContext(), MainActivity.class);
        startActivity(intent);
    }

    public void changeUsername(View v) {
        TextView changeUsername = findViewById(R.id.changeUsername);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Change username");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    MainActivity.username=input.getText().toString();
                }
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void changePassword(View v) {
        TextView changePassword = findViewById(R.id.changePassword);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Change password");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    MainActivity.pass=input.getText().toString();
                }
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void updateAge(View v) {
        TextView updateAge = findViewById(R.id.updateAge);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Update age");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    EnterAgeActivity.a=Integer.parseInt(input.getText().toString());
                }
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void updateHeight(View v) {
        TextView updateHeight = findViewById(R.id.updateHeight);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Update height");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    EnterHeightActivity.h=Integer.parseInt(input.getText().toString());
                }
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void updateWeight(View v) {
        TextView updateWeight = findViewById(R.id.updateWeight);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Update weight");

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        alert.setView(input);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (!(input.getText().toString().matches(""))) {
                    EnterWeightActivity.w=Integer.parseInt(input.getText().toString());
                }
            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });

        alert.show();
    }
}
