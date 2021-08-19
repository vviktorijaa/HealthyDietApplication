package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecipesCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_categories);
    }

    public void backToRecipesActivity(View v){
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }

    public void home(View v){
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void profile(View v){
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipes(View v){
        Intent intent = new Intent(v.getContext(), RecipesActivity.class);
        startActivity(intent);
    }
}
