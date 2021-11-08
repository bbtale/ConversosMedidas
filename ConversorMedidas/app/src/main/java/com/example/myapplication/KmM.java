package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class KmM extends AppCompatActivity {

    EditText edtKmFunc;
    EditText edtMFunc;
    Button btnConverterFunc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        edtKmFunc = (EditText) findViewById(R.id.edtKm);
        edtMFunc = (EditText)findViewById(R.id.edtM);
        btnConverterFunc = (Button)findViewById(R.id.btnConv5);

        btnConverterFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km = Double.parseDouble(edtKmFunc.getText().toString());
                double m = km*1000;
                edtMFunc.setText(String.valueOf(m));
            }
        });
    }
}