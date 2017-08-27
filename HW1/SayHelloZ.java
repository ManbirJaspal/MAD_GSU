package com.example.manbir.say_hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SayHelloZ extends AppCompatActivity {

    private EditText ManbirJaspal;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello_z);
    }

    public void printHelloz(View v) {
        Button hellozButton  = (Button) v;
        ((Button) v).setText("You clicked me!");

        ManbirJaspal = (EditText) findViewById(R.id.inputText);

        output = (TextView) findViewById(R.id.outputText);
        output.setText("Hello, " + ManbirJaspal.getText());
        output.setVisibility(View.VISIBLE);
    }


}

