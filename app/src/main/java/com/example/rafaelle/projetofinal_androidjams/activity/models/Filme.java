package com.example.rafaelle.projetofinal_androidjams.activity.models;

import android.media.Image;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Rafaelle on 27/04/2016.
 */
public class Filme {

    private String titulo;
    private int data;
    private int duracao;
    private Float nota;
    private boolean favorito;
    private String descricao;
    private ArrayList<String> estilo;

    public Filme(String titulo,ArrayList<String> estilo, int data, int duracao, Float nota, String descricao){
        this.titulo = titulo;
        this.estilo = estilo;
        this.data = data;
        this.duracao = duracao;
        this.nota = nota;
        this.descricao = descricao;
        favorito = false;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<String> getEstilo() {
        return estilo;
    }

    public void setEstilo(ArrayList<String> estilo) {
        this.estilo = estilo;
    }
}
