package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info12);
    }

    public void close12(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void finish12(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void back11(View v) {
        Intent intent = new Intent(v.getContext(), Info11Activity.class);
        startActivity(intent);
    }
}
