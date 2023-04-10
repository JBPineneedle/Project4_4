package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnMod;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnMod = findViewById(R.id.btnMod);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 + num2;
                tvResult.setText("결과값 : " + result);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 - num2;
                tvResult.setText("결과값 : " + result);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double result = num1 * num2;
                tvResult.setText("결과값 : " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                if(num2 == 0){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                double result = num1 / num2;
                tvResult.setText("결과값 : " + result);
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                if(num2 == 0){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
                double result = num1 % num2;
                tvResult.setText("결과값 : " + result);
            }
        });
    }
}
