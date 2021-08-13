package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info10);
    }

    public void close10(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void next11(View v) {
        Intent intent = new Intent(v.getContext(), Info11Activity.class);
        startActivity(intent);
    }

    public void back9(View v) {
        Intent intent = new Intent(v.getContext(), Info9Activity.class);
        startActivity(intent);
    }
}
