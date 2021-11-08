package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CmM extends AppCompatActivity {

    EditText edtCmFunc2, edtMFunc3;
    Button btnConvFunc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_m);

        edtCmFunc2 = (EditText) findViewById(R.id.edtCm2);
        edtMFunc3 = (EditText) findViewById(R.id.edtM4);
        btnConvFunc4 = (Button) findViewById(R.id.btnConv4);

        btnConvFunc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cm = Double.parseDouble(edtCmFunc2.getText().toString());
                double m = cm/100;
                edtMFunc3.setText(String.valueOf(m));
            }
        });
    }
}