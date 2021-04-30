package com.example.addtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;


public class MainActivity extends AppCompatActivity {
    TextView answer;
    Button btnAns;
    EditText firstInput,secondInput;

    int a,b;
    int sum;
    AtomicInteger i= new AtomicInteger();


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////////////////////////////////////////////////////
         answer = findViewById(R.id.answer);

        btnAns = findViewById(R.id.showAns);
        firstInput=findViewById(R.id.firstInput);
        secondInput=findViewById(R.id.secondInput);




        btnAns.setOnClickListener(v -> {
         int x=   Integer.parseInt( firstInput.getText().toString());
         int y=   Integer.parseInt( secondInput.getText().toString());
            sum=x+y;
            answer.setText("answer is :"+sum);
        });





    }
}