package com.example.rafaelle.projetofinal_androidjams.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rafaelle.projetofinal_androidjams.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void filmeClicado(View view){
        switch (view.getId()) {
            case R.id.avengersLayout:
                Toast.makeText(MainActivity.this, "Avengers", Toast.LENGTH_SHORT).show();
                break;
            case R.id.divertidamenteLayout :
                Toast.makeText(MainActivity.this, "Divertidamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jurassicWorldLayout :
                Toast.makeText(MainActivity.this, "Jurassic", Toast.LENGTH_SHORT).show();
                break;
            case R.id.madMaxLayout :
                Toast.makeText(MainActivity.this, "Mad Max", Toast.LENGTH_SHORT).show();
                break;
            case R.id.queHorasElaVoltaLayout :
                Toast.makeText(MainActivity.this, "Que horas ela volta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.starWarsLayout :
                Toast.makeText(MainActivity.this, "Star Wars", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
