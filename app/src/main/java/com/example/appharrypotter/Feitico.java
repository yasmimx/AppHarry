package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Feitico extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    Sensor sensor;
    ImageButton btnvoltar, btnFeitico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feitico);

        btnvoltar = (ImageButton) findViewById(R.id.btnvoltar);
        btnFeitico = findViewById(R.id.btnFeitico);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    // Quando ativa o sensor
    public void onSensorChanged(SensorEvent event){

        // Variável do Sensor
        float direção = event.values[0];

        if(direção < -7){
            // aqui coloca o que fazer quando ativar sensor

            //teste só pra ver se ta funcionando
            Intent intent = new Intent(this, Quiz.class);
            startActivity(intent);
        }
        else{
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }


    public void Voltar(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openFeitico(View view) {
        Intent intent = new Intent(this, TelaFeiticos.class);
        startActivity(intent);
    }

}