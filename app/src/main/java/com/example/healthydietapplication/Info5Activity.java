package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info5);
    }

    public void close5(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void next6(View v) {
        Intent intent = new Intent(v.getContext(), Info6Activity.class);
        startActivity(intent);
    }

    public void back4(View v) {
        Intent intent = new Intent(v.getContext(), Info4Activity.class);
        startActivity(intent);
    }
}
