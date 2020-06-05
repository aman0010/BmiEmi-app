package com.example.bmiemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBmi, btnEmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBmi = findViewById(R.id.btnBmi);
        btnEmi = findViewById(R.id.btnEmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBmi = new Intent(getApplicationContext(), BMI.class);
                startActivity(intentBmi);
            }
        });

        btnEmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEmi = new Intent(getApplicationContext(), EMI.class);
                startActivity(intentEmi);
            }
        });

    }
}