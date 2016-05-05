package com.example.rafaelle.projetofinal_androidjams;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rafaelle.projetofinal_androidjams.R;
import com.example.rafaelle.projetofinal_androidjams.models.Filme;


public class DetalhesFilmeFragment extends Fragment {

    public static final String TAG = "DETALHES_FILME_FRAGMENT";
    Filme filme ;
    //private Filme filme;
    private static DetalhesFilmeFragment instance;
    private int imagem;

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

    public void filmeParaDetalhar(Filme filme){
        this.filme = filme;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View mView = inflater.inflate(R.layout.layout_detalhe_filme, container, false);

        TextView titulo = (TextView) mView.findViewById(R.id.tituloFilme);
        titulo.setText(filme.getTitulo());

        TextView ano = (TextView) mView.findViewById(R.id.anoFilme);
        ano.setText(String.valueOf(filme.getData()));

        ImageView poster = (ImageView) mView.findViewById(R.id.imagemFilme);
        poster.setImageResource(filme.getIdImg());

        TextView duracao = (TextView) mView.findViewById(R.id.duracaoFilme);
        duracao.setText(String.valueOf(filme.getDuracao()) + " min");

        TextView nota = (TextView) mView.findViewById(R.id.notaFilme);
        nota.setText("Nota " + String.valueOf(filme.getNota()));

        TextView descricao = (TextView) mView.findViewById(R.id.descricaoFilme);
        descricao.setText(filme.getDescricao());

        CheckBox checkBox = (CheckBox) mView.findViewById(R.id.favoritoFilme);
        if (SharedPreferencesUtils.getIsFavorito(getContext(), filme.getIdImg())){
            checkBox.setChecked(true);
        } else {
            checkBox.setChecked(false);
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferencesUtils.setIsFavorito(getContext(), filme.getIdImg(), isChecked);
            }
        });

        return mView;
    }



}
