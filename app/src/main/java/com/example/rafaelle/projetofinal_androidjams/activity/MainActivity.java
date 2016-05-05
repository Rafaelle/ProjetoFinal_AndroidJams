package com.example.rafaelle.projetofinal_androidjams.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.rafaelle.projetofinal_androidjams.R;
import com.example.rafaelle.projetofinal_androidjams.SharedPreferencesUtils;
import com.example.rafaelle.projetofinal_androidjams.models.Filme;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lista_filmes);
    }

    public void onCLickFilme(View view){

        Filme filme;
        Intent detalheFilmeAct;

        switch (view.getId()) {
            case R.id.avengersLayout:
                filme = new Filme(R.drawable.avengers_img,"Vingadores: A Era de Ultron", 2015, 141, Float.valueOf("7.5"),
                        getResources().getString(R.string.descAvengers), SharedPreferencesUtils.getIsFavorito(this,R.drawable.avengers_img),
                        "https://www.youtube.com/watch?v=I4lgl7ImHSg");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);

                break;

            case R.id.divertidamenteLayout :
                filme =  new Filme(R.drawable.divertidamente_img, "Divertida Mente", 2015, 102, Float.valueOf("8.3"),
                        getResources().getString(R.string.descDivertidamente) , SharedPreferencesUtils.getIsFavorito(this,R.drawable.divertidamente_img),
                        "https://www.youtube.com/watch?v=VBtuhyFddnk");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);
                //Toast.makeText(MainActivity.this, "Divertidamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jurassicWorldLayout :
                filme = new  Filme(R.drawable.jurassic_world_img, "Jurassic World: O Mundo dos Dinossauros", 2015, 124, Float.valueOf("7.1"),
                        getResources().getString(R.string.descJurassicWorld) , SharedPreferencesUtils.getIsFavorito(this,R.drawable.jurassic_world_img),
                        "https://www.youtube.com/watch?v=LfYS9bNs0Eg");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);
                //Toast.makeText(MainActivity.this, "Jurassic", Toast.LENGTH_SHORT).show();
                break;
            case R.id.madMaxLayout :
                filme = new Filme(R.drawable.mad_max_img, "Mad Max: Estrada da Fúria", 2015, 120, Float.valueOf("8.1"),
                        getResources().getString(R.string.descMadMax) , SharedPreferencesUtils.getIsFavorito(this,R.drawable.mad_max_img),
                        "https://www.youtube.com/watch?v=_kVupD4_Jj4");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);
                //Toast.makeText(MainActivity.this, "Mad Max", Toast.LENGTH_SHORT).show();
                break;
            case R.id.queHorasElaVoltaLayout :
                filme = new Filme(R.drawable.que_horas_ela_volta_img, "Que Horas Ela Volta?", 2015, 114, Float.valueOf("8"),
                        getResources().getString(R.string.descQueHorasElaVolta), SharedPreferencesUtils.getIsFavorito(this,R.drawable.que_horas_ela_volta_img),
                        "https://www.youtube.com/watch?v=r3mEwUGAw9Y");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);
                // Toast.makeText(MainActivity.this, "Que horas ela volta", Toast.LENGTH_SHORT).show();
                break;
            case R.id.starWarsLayout :
                filme = new Filme(R.drawable.star_wars_img, "Star Wars: O Despertar da Força", 2015, 124, Float.valueOf("8.3"),
                        getResources().getString(R.string.descStarWars), SharedPreferencesUtils.getIsFavorito(this,R.drawable.star_wars_img),
                        "https://www.youtube.com/watch?v=yMglylP5xhA");

                detalheFilmeAct = new Intent(view.getContext(), DetalhesFilmeActivity.class);
                detalheFilmeAct.putExtra("FILME", filme);

                startActivity(detalheFilmeAct);
                //Toast.makeText(MainActivity.this, "Star Wars", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
