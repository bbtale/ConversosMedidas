package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    EditText edtMFunc2;
    EditText edtKmFunc2;
    Button btnConvFunc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);

        edtMFunc2 = (EditText) findViewById(R.id.edtM2);
        edtKmFunc2 = (EditText) findViewById(R.id.edtKm2);
        btnConvFunc2 = (Button) findViewById(R.id.btnConv2);

        btnConvFunc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtMFunc2.getText().toString());
                double km = m/1000;
                edtKmFunc2.setText(String.valueOf(km));
            }
        });
    }
}