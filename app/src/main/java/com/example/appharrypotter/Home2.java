package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Home2 extends AppCompatActivity {

    ImageButton btnTeste, btnWallpaper1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTeste = findViewById(R.id.btnTeste);
        btnWallpaper1 = findViewById(R.id.btnWallpaper1);
    }
    public void openTeste(View view) {
        Intent intent = new Intent(this, Quiz2.class);
        startActivity(intent);
    }
    public void openWallpaper(View view) {
        Intent intent = new Intent(this, Wallpaper.class);
        startActivity(intent);
    }

}