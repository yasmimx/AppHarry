package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton btnTeste, btnWallpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTeste = findViewById(R.id.btnTeste);
        btnWallpaper = findViewById(R.id.btnWallpaper);

    }

    public void openTeste(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    public void openWallpaper(View view) {
        Intent intent = new Intent(this, Wallpaper.class);
        startActivity(intent);
    }
}