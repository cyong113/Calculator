package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText myTextField1;
    EditText myTextField2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextField1 = findViewById(R.id.myTextField);
        myTextField2 = findViewById(R.id.myTextField2);
    }

    public void buttonAdd(View view) {
        int firstNum = Integer.parseInt(myTextField1.getText().toString());
        int secondNum = Integer.parseInt(myTextField2.getText().toString());

        int addition = firstNum + secondNum;

        Intent intent = new Intent(this, ResultActivity.class);
1        intent.putExtra("result", addition);

        // Start the ResultActivity
        startActivity(intent);
    }

    public void buttonSub(View view) {
        int firstNum = Integer.parseInt(myTextField1.getText().toString());
        int secondNum = Integer.parseInt(myTextField2.getText().toString());

        int subtraction = firstNum - secondNum;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", subtraction);
        startActivity(intent);
    }

    public void buttonMul(View view) {
        int firstNum = Integer.parseInt(myTextField1.getText().toString());
        int secondNum = Integer.parseInt(myTextField2.getText().toString());

        int multiplication = firstNum * secondNum;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", multiplication);
        startActivity(intent);
    }

    public void buttonDiv(View view) {
        int firstNum = Integer.parseInt(myTextField1.getText().toString());
        int secondNum = Integer.parseInt(myTextField2.getText().toString());

        if (secondNum == 0) {
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
        } else {
            int division = firstNum / secondNum;

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", division);
            startActivity(intent);
        }
    }
}
