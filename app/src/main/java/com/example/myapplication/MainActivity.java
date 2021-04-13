package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private TextView answer;
    private EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        answer = findViewById(R.id.answer);
        value = findViewById(R.id.value);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double kg = Double.parseDouble(String.valueOf(value.getText()));
                double po = kg*2.20462;
                answer.setText(String.valueOf(po));
            }
        });

    }
}