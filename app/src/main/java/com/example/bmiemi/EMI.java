package com.example.bmiemi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EMI extends AppCompatActivity {

    TextView tvResult;
    EditText etPrincipal, etRate, etNoOfMonth;
    Button btnCalculate;
    Double principal, rate, noOfMonth, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_m_i);

        tvResult = findViewById(R.id.tvResult);

        etPrincipal = findViewById(R.id.etPrincipal);
        etRate      = findViewById(R.id.etRate);
        etNoOfMonth = findViewById(R.id.etNoOfMonth);

        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal = Double.parseDouble(etPrincipal.getText().toString());
                rate      = Double.parseDouble(etRate.getText().toString());
                noOfMonth = Double.parseDouble(etNoOfMonth.getText().toString());
                rate      = rate/(12*100);

                result = (principal*rate*Math.pow(1+rate,noOfMonth))/(Math.pow(1+rate,noOfMonth)-1);

                tvResult.setText(String.format("%.2f", result));
            }
        });
    }
}