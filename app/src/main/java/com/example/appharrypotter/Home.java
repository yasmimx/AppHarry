package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       

        getSupportActionBar().hide();

        btnTeste = findViewById(R.id.btnTeste);
    }

    public void openTeste(View view) {
        Intent intent = new Intent(this, Teste.class);
        startActivity(intent);
    }
}