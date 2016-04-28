package com.example.rafaelle.projetofinal_androidjams.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rafaelle.projetofinal_androidjams.R;
import com.example.rafaelle.projetofinal_androidjams.activity.models.Filme;

public class DetalhesFilmeFragment extends Fragment {

    private Filme filme;
    private static DetalhesFilmeFragment instance;

    public DetalhesFilmeFragment() {
        // Required empty public constructor
    }

    public static DetalhesFilmeFragment getInstance() {
        if (instance == null){
            instance = new DetalhesFilmeFragment();
            Bundle args = new Bundle();
            instance.setArguments(args);
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_detalhes_filme, container, false);
        Toast.makeText(getContext(), "Filme", Toast.LENGTH_SHORT).show();

        TextView tituloFilme = (TextView) mView.findViewById(R.id.tituloFilme);
        tituloFilme.setText(filme.getTitulo());
        TextView anoFilme =(TextView) mView.findViewById(R.id.anoFilme);
        anoFilme.setText(filme.getData());
        return mView;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setFilmeDisplay(Filme filme){
        this.filme = filme;
    }


}
