package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RecipesCategoriesActivity extends AppCompatActivity {

    Switch breakfast = findViewById(R.id.switchBreakfast);
    Switch lunch = findViewById(R.id.switchLunch);
    Switch snacks = findViewById(R.id.switchSnacks);
    Switch dinner = findViewById(R.id.switchDinner);
    Switch low = findViewById(R.id.switchLowCalorie);
    Switch high = findViewById(R.id.switchHighCalorie);

    LinearLayout b = findViewById(R.id.breakfastText);
    LinearLayout b1 = findViewById(R.id.breakfastRecipe);

    LinearLayout l = findViewById(R.id.lunchText);
    LinearLayout l1 = findViewById(R.id.lunchRecipe);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_categories);

//        if(breakfast.isChecked()){
//            l.setVisibility(View.GONE);
//            l1.setVisibility(View.GONE);
//        }
//        else{
//            l.setVisibility(View.VISIBLE);
//            l1.setVisibility(View.VISIBLE);
//        }
//
//        if(lunch.isChecked()){
//            b.setVisibility(View.GONE);
//            b1.setVisibility(View.GONE);
//        }
//        else{
//            b.setVisibility(View.VISIBLE);
//            b1.setVisibility(View.VISIBLE);
//        }
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
