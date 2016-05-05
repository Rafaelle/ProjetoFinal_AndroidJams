package com.example.rafaelle.projetofinal_androidjams.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.rafaelle.projetofinal_androidjams.R;
import com.example.rafaelle.projetofinal_androidjams.models.Filme;
import com.example.rafaelle.projetofinal_androidjams.DetalhesFilmeFragment;

public class DetalhesFilmeActivity extends AppCompatActivity {
    DetalhesFilmeFragment detalhesFilmeFragment;
    private Filme filme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detalhesFilmeFragment = DetalhesFilmeFragment.getInstance();
        setContentView(R.layout.fragment_detalhes_filme);

        Intent intent = getIntent();
        filme = (Filme) intent.getParcelableExtra("FILME");

        if (savedInstanceState == null) {
            detalhesFilmeFragment.filmeParaDetalhar(filme);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragDetalhesFilme, detalhesFilmeFragment).commit();
        }
    }

    public void onClickTrailer(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(filme.getURITrailer()));
        startActivity(i);
    }
}
