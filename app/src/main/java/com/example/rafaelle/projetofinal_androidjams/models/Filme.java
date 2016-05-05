package com.example.rafaelle.projetofinal_androidjams.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.net.URI;

/**
 * Created by Rafaelle on 27/04/2016.
 */
public class Filme implements Parcelable {

    private int idImg;
    private String titulo;
    private int data;
    private int duracao;
    private Float nota;
    private boolean favorito;
    private String descricao;
    private String URITrailer;

    public Filme(int idImg,String titulo, int data, int duracao, Float nota, String descricao, Boolean favorito, String URITrailer){
        this.idImg = idImg;
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.nota = nota;
        this.descricao = descricao;
        this.favorito = favorito;
        this.URITrailer = URITrailer;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(idImg);
        out.writeString(titulo);
        out.writeInt(data);
        out.writeInt(duracao);
        out.writeFloat(nota);
        out.writeString(descricao);
        out.writeByte((byte) (favorito ? 1 : 0));
        out.writeString(URITrailer);
    }

    public static final Parcelable.Creator<Filme> CREATOR = new Parcelable.Creator<Filme>() {
        public Filme createFromParcel(Parcel in) {
            return new Filme(in);
        }

        public Filme[] newArray(int size) {
            return new Filme[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private Filme(Parcel in) {
        idImg = in.readInt();
        titulo = in.readString();
        data = in.readInt();
        duracao = in.readInt();
        nota = in.readFloat();
        descricao = in.readString();
        favorito = in.readByte() != 0;
        URITrailer = in.readString();
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
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

    public String getURITrailer() {
        return URITrailer;
    }

    public void setURITrailer(String URITrailer) {
        this.URITrailer = URITrailer;
    }
}
