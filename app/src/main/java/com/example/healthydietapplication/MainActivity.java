package com.example.healthydietapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.healthydietapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    Button b1;

    public static final String MyPreferences = "MyPreferences" ;
    public static final String Username = "Username";
    public static final String Password = "Password";

    SharedPreferences sharedpreferences;

    private ActivityMainBinding binding;

    //public String usernameInput= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=(EditText)findViewById(R.id.usernameText);
        password=(EditText)findViewById(R.id.passwordText);
        b1=(Button)findViewById(R.id.button);
        sharedpreferences = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(binding.usernameText.length()==0 && binding.passwordText.length()==0){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()!=0 && binding.passwordText.length()==0){
                    //username = binding.usernameText.getText().toString();
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()==0 && binding.passwordText.length()>8){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("");
                }
                else if(binding.usernameText.length()!=0 && (binding.passwordText.length()!=0 && binding.passwordText.length()<8)){
                    //username = binding.usernameText.getText().toString();
                    binding.passwordConstraint.setText("Your password must contain at least 8 characters.");
                    binding.fillInTheBlanks.setText("");
                }
                else if(binding.usernameText.length()==0 && (binding.passwordText.length()!=0 && binding.passwordText.length()<8)){
                    binding.fillInTheBlanks.setText("Please, fill in the blanks.");
                    binding.passwordConstraint.setText("Your password must contain at least 8 characters.");
                }
                else{
                    String n  = userName.getText().toString();
                    String ph  = password.getText().toString();
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(Username, n);
                    editor.putString(Password, ph);
                    editor.commit();

                    binding.fillInTheBlanks.setText("");
                    binding.passwordConstraint.setText("");
                    startActivity(new Intent(v.getContext(), YourGenderActivity.class));
                }
            }
        });
    }
}