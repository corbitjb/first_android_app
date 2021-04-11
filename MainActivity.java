package com.example.android.joelsjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button _increase;
    private TextView _value;
    private TextView _message;
    private static int _counter = 0;
    private String _stringVal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _increase = (Button) findViewById(R.id._increase);
        _value = (TextView) findViewById(R.id.buttonPresses);
        _message = (TextView) findViewById(R.id.finMessage);

        _increase.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Increasing value...");
                _counter++;
                _stringVal = Integer.toString(_counter);
                _value.setText(_stringVal);
                if(_counter == 69) {
                    _message.setVisibility(View.VISIBLE);
                }
                else{
                        _message.setVisibility(View.GONE);
                    }
            }
        });
    }
}