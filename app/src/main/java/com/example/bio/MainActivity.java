package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private EditText enterhobbies;
    private TextView hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);

        enterhobbies = findViewById(R.id.hobbies);
        hobbies = findViewById(R.id.hobbies_text);*/
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void add_hobbies(View view) {
        hobbies.setText(String.format("Hobbies: %s ", enterhobbies.getText().toString().trim()));
        hobbies.setVisibility(View.VISIBLE);


        //hide keyboard
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}