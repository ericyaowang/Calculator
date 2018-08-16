package com.example.yaowang.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button add, substract, multiply, divide,dot, equal;

    double answer;

    double num1, num2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        add = (Button) findViewById(R.id.add);
        substract = (Button) findViewById(R.id.substract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1.getText().toString());

                num2 = Integer.parseInt(number2.getText().toString());

                answer = num1 + num2;



            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1.getText().toString());

                num2 = Integer.parseInt(number2.getText().toString());

                answer = num1 - num2;


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1.getText().toString());

                num2 = Integer.parseInt(number2.getText().toString());

                answer = num1 * num2;



            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(number1.getText().toString());

                num2 = Integer.parseInt(number2.getText().toString());

                answer = num1 / num2;


            }
        });

        dot.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                System.out.println(".");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(answer));
            }
        });








    }
}
