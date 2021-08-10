package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info3);
    }

    public void close3(View v) {
        Intent intent = new Intent(v.getContext(), HomeActivity.class);
        startActivity(intent);
    }

    public void next4(View v) {
        Intent intent = new Intent(v.getContext(), Info4Activity.class);
        startActivity(intent);
    }

    public void back2(View v) {
        Intent intent = new Intent(v.getContext(), Info2Activity.class);
        startActivity(intent);
    }
}
