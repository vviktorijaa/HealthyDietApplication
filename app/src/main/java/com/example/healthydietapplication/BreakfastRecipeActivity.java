package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BreakfastRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast_recipe);
    }

    public void homeA(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void profileA(View v) {
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipesA(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void backToRecipesA(View v) {
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }
}
