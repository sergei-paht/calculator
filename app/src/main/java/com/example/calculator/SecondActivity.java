package com.example.calculator;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView text = findViewById(R.id.textView);
        Integer intSum1 = getIntent().getExtras().getInt("intSum1");
        Integer intSum2 = getIntent().getExtras().getInt("intSum2");
        text.setText(intSum1.toString() + " + " + check(intSum2) +" = " + (intSum1 + intSum2)); }

    public String check(Integer x){
        if (x < 0) {return "(" + x.toString() + ")";}
        return x.toString(); }
}