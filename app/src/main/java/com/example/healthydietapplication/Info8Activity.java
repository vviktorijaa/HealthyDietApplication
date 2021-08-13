package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info8);
    }

    public void close8(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void next9(View v) {
        Intent intent = new Intent(v.getContext(), Info9Activity.class);
        startActivity(intent);
    }

    public void back7(View v) {
        Intent intent = new Intent(v.getContext(), Info7Activity.class);
        startActivity(intent);
    }
}