package com.example.numbersandotherthingstodo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText el1;
    private EditText el2;
    private TextView resText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClickSum(View view) {

        el1 = (EditText) findViewById(R.id.Num1);
        el2 = (EditText) findViewById(R.id.Num2);
        resText = (TextView) findViewById(R.id.Result);

        Double num1 = Double.parseDouble(el1.getText().toString());
        Double num2 = Double.parseDouble(el2.getText().toString());

        Double result = num1 + num2;
        resText.setText(result.toString());

    }

    @SuppressLint("SetTextI18n")
    public void onButtonClickSubtruction(View view) {

        el1 = (EditText) findViewById(R.id.Num1);
        el2 = (EditText) findViewById(R.id.Num2);
        resText = (TextView) findViewById(R.id.Result);

        Double num1 = Double.parseDouble(el1.getText().toString());
        Double num2 = Double.parseDouble(el2.getText().toString());

        Double result = num1 - num2;
        resText.setText(result.toString());

    }

    @SuppressLint("SetTextI18n")
    public void onButtonClickMultiplication(View view) {

        el1 = (EditText) findViewById(R.id.Num1);
        el2 = (EditText) findViewById(R.id.Num2);
        resText = (TextView) findViewById(R.id.Result);

        Double num1 = Double.parseDouble(el1.getText().toString());
        Double num2 = Double.parseDouble(el2.getText().toString());

        Double result = num1 * num2;
        resText.setText(result.toString());

    }

    @SuppressLint("SetTextI18n")
    public void onButtonClickDivision(View view) {

        el1 = (EditText) findViewById(R.id.Num1);
        el2 = (EditText) findViewById(R.id.Num2);
        resText = (TextView) findViewById(R.id.Result);

        Double num1 = Double.parseDouble(el1.getText().toString());
        Double num2 = Double.parseDouble(el2.getText().toString());

        Double result = null;

        if (num2 == 0){
            resText.setText("Error...");
        } else {
            result = num1 / num2;
            resText.setText(result.toString());
        }
    }
}
