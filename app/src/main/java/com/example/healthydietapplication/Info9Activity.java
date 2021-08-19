package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info9);
    }

    public void close9(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void next10(View v) {
        Intent intent = new Intent(v.getContext(), Info10Activity.class);
        startActivity(intent);
    }

    public void back8(View v) {
        Intent intent = new Intent(v.getContext(), Info8Activity.class);
        startActivity(intent);
    }
}