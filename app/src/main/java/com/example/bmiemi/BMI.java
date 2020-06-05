package com.example.bmiemi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    TextView tvResult;
    EditText etWeight, etHeight;
    Button btnCalculate;
    Float weight, height, result;
    String index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i);

        tvResult = findViewById(R.id.tvResult);

        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);

        btnCalculate = findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight = Float.parseFloat(etWeight.getText().toString());
                height = Float.parseFloat(etHeight.getText().toString());
                result = weight/(height*height);

                if (result > 25 & result< 29.9) index = "overweight";
                else if (result > 18.5 & result < 24.9) index = "healthy / Normal Weight";
                else if (result < 18.5) index = "Underweight";

                tvResult.setText(result + "\n" + index);
            }
        });

    }
}