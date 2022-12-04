package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaFeiticos extends AppCompatActivity {

    Button btnlumos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_feiticos);


        btnlumos = (Button) findViewById(R.id.btnlumos);

    }

    public void Lumos(View view) {
        Intent intent = new Intent(this, Feitico.class);
        startActivity(intent);
    }
}