package com.example.healthydietapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.healthydietapplication.databinding.ActivityMainBinding;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    Button b1;

    private ActivityMainBinding binding;

    public static String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.usernameText);
        password=findViewById(R.id.passwordText);
        b1=findViewById(R.id.button);

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
                    username = binding.usernameText.getText().toString();
                    binding.fillInTheBlanks.setText("");
                    binding.passwordConstraint.setText("");
                    startActivity(new Intent(v.getContext(), YourGenderActivity.class));
                }
            }
        });
    }

//    private void writeToFile(String data) {
//        try {
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.openFileOutput("file.txt", Context.MODE_PRIVATE));
//            outputStreamWriter.write("username "+ data);
//            outputStreamWriter.close();
//        }
//        catch (IOException e) {
//            Log.e("Exception", "File write failed: " + e.toString());
//        }
//    }
}