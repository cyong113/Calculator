package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Retrieve the result value from the intent
        int result = getIntent().getIntExtra("result", 0);

        // Display the result in a TextView
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("Result: " + result);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the CalculatorActivity
                Intent intent = new Intent(ResultActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });
    }
}
