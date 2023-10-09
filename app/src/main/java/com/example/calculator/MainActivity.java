package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 + num2;
                tvResult.setText("Result: " + result);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 - num2;
                tvResult.setText("Result: " + result);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 * num2;
                tvResult.setText("Result: " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 / num2;
                tvResult.setText("Result: " + result);
            }
        });
    }
}
