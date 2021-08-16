package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_activity);

        LinearLayout l = findViewById(R.id.lunchText);
        LinearLayout l1 = findViewById(R.id.lunchRecipe);
        LinearLayout b = findViewById(R.id.breakfastText);
        LinearLayout b1 = findViewById(R.id.breakfastRecipe);

        final LinearLayout button = findViewById(R.id.searchButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView searchText = findViewById(R.id.searchText);
                if(searchText.getText().toString().equalsIgnoreCase("breakfast") || searchText.getText().toString().equalsIgnoreCase("bacon") || searchText.getText().toString().equalsIgnoreCase("egg")){
                    b.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                    l.setVisibility(View.GONE);
                    l1.setVisibility(View.GONE);
                }
                if(searchText.getText().toString().equalsIgnoreCase("lunch")){
                    l.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    b1.setVisibility(View.GONE);
                }
                if(searchText.getText().toString().length() == 0){
                    l.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    b.setVisibility(View.VISIBLE);
                    b1.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void homeActivity(View v){
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void myProfileActivity(View v){
        Intent intent = new Intent(v.getContext(), MyProfileActivity.class);
        startActivity(intent);
    }

    public void recipesCategories(View v){
        Intent intent = new Intent(v.getContext(), RecipesCategoriesActivity.class);
        startActivity(intent);
    }
}