package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SnacksRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch_recipe);
    }

    public void backToRecipesAct(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void homeAct(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void profileAct(View v) {
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipesAct(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }
}
