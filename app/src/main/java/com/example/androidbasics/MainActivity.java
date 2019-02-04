package com.example.androidbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button displayBtn;
    EditText textInput;
    TextView userText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayBtn = (Button) findViewById(R.id.display);
        textInput = (EditText) findViewById(R.id.userInput);
        userText = (TextView) findViewById(R.id.inputDisplay);


        displayBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String eText = textInput.getText().toString();
                userText.setText(eText);
                eText = " ";
                textInput.setText(eText);
            }
        });


    }
}