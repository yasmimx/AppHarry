package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaFeiticos2 extends AppCompatActivity {

    Button btnlumos;
    ImageButton btnvoltar, btnFeitico, btnTeste;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_feiticos2);


        btnlumos = (Button) findViewById(R.id.btnlumos2);
        btnvoltar = (ImageButton) findViewById(R.id.btnvoltar2);
        btnFeitico = findViewById(R.id.btnFeitico2);
        btnTeste = findViewById(R.id.btnTeste2);
    }

    public void Lumos(View view) {
        Intent intent = new Intent(this, Feitico.class);
        startActivity(intent);
    }

    public void Voltar(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openFeitico(View view) {
        Intent intent = new Intent(this, TelaFeiticos.class);
        startActivity(intent);
    }

    public void openTeste(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}