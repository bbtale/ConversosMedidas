package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnKmMfunc, btnMKmfunc, btnMCmfunc, btnCmMfunc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKmMfunc = (Button) findViewById(R.id.btnKmM);
        btnMKmfunc = (Button) findViewById(R.id.btnMKm);
        btnMCmfunc = (Button) findViewById(R.id.btnMCm);
        btnCmMfunc = (Button) findViewById(R.id.btnCmM);

        btnKmMfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent(MainActivity.this, KmM.class);
                startActivity(func);
            }
        });

        btnMKmfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent funcM = new Intent(MainActivity.this, MKm.class);
                startActivity(funcM);
            }
        });

        btnMCmfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent funcCm = new Intent(MainActivity.this, MCm.class);
                startActivity(funcCm);
            }
        });

        btnCmMfunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent funcCm2 = new Intent(MainActivity.this, CmM.class);
                startActivity(funcCm2);
            }
        });



    }
}