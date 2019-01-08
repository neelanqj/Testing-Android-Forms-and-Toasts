package com.otbxsolutions.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){
        EditText myTextField = findViewById(R.id.inputTxt);
        Toast.makeText(MainActivity.this, "hi there " + myTextField.getText(), Toast.LENGTH_LONG).show();

        Log.i("info","button pressed "+ myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
