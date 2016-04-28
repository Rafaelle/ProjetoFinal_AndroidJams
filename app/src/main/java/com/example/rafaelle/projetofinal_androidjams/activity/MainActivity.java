package com.example.rafaelle.projetofinal_androidjams.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.rafaelle.projetofinal_androidjams.R;
import com.example.rafaelle.projetofinal_androidjams.activity.models.Filme;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private DetalhesFilmeFragment detalhesFilmeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detalhesFilmeFragment = detalhesFilmeFragment.getInstance();
    }

    public void onCLickFilme(View view){
        Filme filme;
        switch (view.getId()) {
            case R.id.avengersLayout:
                ArrayList<String> estilos = new ArrayList<String>();
                estilos.add("ficção cientifica");
                estilos.add("ação");
                filme = new Filme("Vingadores: Era de Ultron",estilos ,2015, 2, Float.valueOf("0.0"), "TEM UM MONTE DE COISA AQUI");
                detalhesFilmeFragment.setFilmeDisplay(filme);
                setContentView(R.layout.fragment_detalhes_filme);
                break;
            case R.id.divertidamenteLayout :
                //Toast.makeText(MainActivity.this, "Divertidamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jurassicWorldLayout :
                //Toast.makeText(MainActivity.this, "Jurassic", Toast.LENGTH_SHORT).show();
                break;
            case R.id.madMaxLayout :
                //Toast.makeText(MainActivity.this, "Mad Max", Toast.LENGTH_SHORT).show();
                break;
            case R.id.queHorasElaVoltaLayout :
               // Toast.makeText(MainActivity.this, "Que horas ela volta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.starWarsLayout :
                //Toast.makeText(MainActivity.this, "Star Wars", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
