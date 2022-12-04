package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class Wallpaper extends AppCompatActivity {

    Button bSetWallpaper, bSetWallpaper2, bSetWallpaper3;
    ImageButton btnvoltar, btnFeitico, btnHome, btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnvoltar = (ImageButton) findViewById(R.id.btnvoltar);
        btnFeitico = findViewById(R.id.btnFeitico);
        btnHome = findViewById(R.id.btnhome);
        btnTeste = findViewById(R.id.btnTeste);

        final WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        bSetWallpaper = findViewById(R.id.btnWall1);
        bSetWallpaper.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {
                    wallpaperManager.setResource(R.drawable.sonserinamain);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        bSetWallpaper2 = findViewById(R.id.btnWall2);
        bSetWallpaper2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {
                    wallpaperManager.setResource(R.drawable.corvinalmain);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        bSetWallpaper3 = findViewById(R.id.btnWall3);
        bSetWallpaper3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {
                    wallpaperManager.setResource(R.drawable.grifinoriamain);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public void Voltar(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openFeitico(View view) {
        Intent intent = new Intent(this, TelaFeiticos.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openTeste(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}