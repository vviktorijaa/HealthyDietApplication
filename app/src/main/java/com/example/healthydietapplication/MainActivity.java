package com.example.healthydietapplication;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.healthydietapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(binding.usernameText.length()==0 && binding.passwordText.length()==0){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()!=0 && binding.passwordText.length()==0){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()==0 && binding.passwordText.length()>8){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()!=0 && (binding.passwordText.length()!=0 && binding.passwordText.length()<8)){
                    binding.passwordConstraint.setText("Your password must contain at least 8 characters.");
                    binding.fillInTheBlanks.setText("");
                }
                else if(binding.usernameText.length()==0 && (binding.passwordText.length()!=0 && binding.passwordText.length()<8)){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("Your password must contain at least 8 characters.");
                }
                else{
                    binding.fillInTheBlanks.setText("");
                    binding.passwordConstraint.setText("");
                    startActivity(new Intent(v.getContext(), YourGenderActivity.class));
                }
            }
        });
    }
}