package com.example.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    SensorManager sensorManager;
    List<Sensor> sensorList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        listView = (ListView) findViewById (R.id.listView1);
        sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        listView.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,  sensorList));

    }
}
