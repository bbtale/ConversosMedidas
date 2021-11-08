package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MCm extends AppCompatActivity {

    EditText edtCmFunc;
    EditText edtMFunc;
    Button btnConvFunc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        edtMFunc = (EditText) findViewById(R.id.edtM3);
        edtCmFunc = (EditText) findViewById(R.id.edtCm);
        btnConvFunc = (Button) findViewById(R.id.btnConv5);

        btnConvFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtMFunc.getText().toString());
                double cm = m*100;
                edtCmFunc.setText(String.valueOf(cm));
            }
        });
    }
}