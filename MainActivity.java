package com.example.calculatorr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  etFirstvalue , etSecondvalue;
    TextView tvAns;
    Button add , subtract , multiply , divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstvalue = findViewById(R.id.etFirstValue);
        etSecondvalue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMul);
        divide = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double firstValue , secondValue , ans;

                firstValue = Double.parseDouble(etFirstvalue.getText().toString());
                secondValue = Double.parseDouble(etSecondvalue.getText().toString());

                ans = firstValue + secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double firstValue , secondValue , ans;

                firstValue = Double.parseDouble(etFirstvalue.getText().toString());
                secondValue = Double.parseDouble(etSecondvalue.getText().toString());

                ans = firstValue - secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double firstValue , secondValue , ans;

                firstValue = Double.parseDouble(etFirstvalue.getText().toString());
                secondValue = Double.parseDouble(etSecondvalue.getText().toString());

                ans = firstValue * secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double firstValue , secondValue , ans;

                firstValue = Double.parseDouble(etFirstvalue.getText().toString());
                secondValue = Double.parseDouble(etSecondvalue.getText().toString());

                ans = firstValue / secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });

    }
}