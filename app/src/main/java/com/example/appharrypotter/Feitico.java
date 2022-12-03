package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

public class Feitico extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
    Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feitico);

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
        //ignora aq

    }


}