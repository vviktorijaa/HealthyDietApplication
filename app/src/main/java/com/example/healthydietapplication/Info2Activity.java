package com.example.healthydietapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Info2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info2);
    }

//    public void close(View v) {
//        Intent intent = new Intent(v.getContext(), HomeActivity.class);
//        startActivity(intent);
//    }

    public void next3(View v) {
        Intent intent = new Intent(v.getContext(), Info3Activity.class);
        startActivity(intent);
    }

    public void back1(View v) {
        Intent intent = new Intent(v.getContext(), Info1Activity.class);
        startActivity(intent);
    }
}
