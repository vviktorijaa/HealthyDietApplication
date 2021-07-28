package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info6);
    }

//    public void close(View v) {
//        Intent intent = new Intent(v.getContext(), HomeActivity.class);
//        startActivity(intent);
//    }

//    public void next(View v) {
//        Intent intent = new Intent(v.getContext(), Info7Activity.class);
//        startActivity(intent);
//    }

    public void back(View v) {
        Intent intent = new Intent(v.getContext(), Info6Activity.class);
        startActivity(intent);
    }
}