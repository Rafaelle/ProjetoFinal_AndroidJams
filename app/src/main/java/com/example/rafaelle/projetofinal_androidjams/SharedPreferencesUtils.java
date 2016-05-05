package com.example.rafaelle.projetofinal_androidjams;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Rafaelle on 29/04/2016.
 */
public class SharedPreferencesUtils {
    protected SharedPreferencesUtils() {}

    public static Boolean getIsFavorito(Context context, int idFilme) {
        SharedPreferences settings = context.getSharedPreferences(String.valueOf(idFilme), Context.MODE_PRIVATE);
        return settings.getBoolean(String.valueOf(idFilme), false);
    }

    public static void setIsFavorito(Context context, int idFilme, Boolean isFavorito){
        SharedPreferences settings = context.getSharedPreferences(String.valueOf(idFilme), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(String.valueOf(idFilme), isFavorito);
        editor.commit();
    }

}
