package com.example.appharrypotter;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = ".MESSAGE";
    FusedLocationProviderClient fusedLocationClient;

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.corvinalbtn);
        btn2 = findViewById(R.id.grifibtn);
        btn3 = findViewById(R.id.sonsebtn);
        btn4 = findViewById(R.id.lufabtn);


        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE );
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        getLocation();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 10) {
            if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLocation();
            } else {
                {
                    Toast.makeText(MainActivity.this, "Permissão de localização negada.", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void getLocation() {
        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
        } else {
            requestPermission();
        }
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 10);
    }

    public void openCorvinal(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        editor = sharedPreferences.edit();

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openGrifinoria(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        editor = sharedPreferences.edit();

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openSonserina(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        editor = sharedPreferences.edit();
        
        Intent intent = new Intent(this, Home2.class);
        startActivity(intent);
    }

    public void openLufa(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        editor = sharedPreferences.edit();


        Intent intent = new Intent(this, Home2.class);
        startActivity(intent);
    }
}