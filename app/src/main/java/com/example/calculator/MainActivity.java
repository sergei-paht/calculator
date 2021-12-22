package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void buttonSum(View view){
        EditText Sum1 = findViewById(R.id.sum1);
        EditText Sum2 = findViewById(R.id.sum2);
        String strSum1 = Sum1.getText().toString();
        String strSum2 = Sum2.getText().toString();
        int intSum1 = Integer.parseInt(strSum1);
        int intSum2 = Integer.parseInt(strSum2);
        if (check(strSum1) && check(strSum2)) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("intSum1", intSum1);
            intent.putExtra("intSum2", intSum2);
            startActivity(intent); }
        else {Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();}
    }
    public boolean check(String x) {
        try {
            Integer.parseInt(x);
        } catch (NumberFormatException e) { return false; }
        return true; }
}