package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.io.IOException;

public class Wallpaper extends AppCompatActivity {

    Button bSetWallpaper, bSetWallpaper2, bSetWallpaper3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
}