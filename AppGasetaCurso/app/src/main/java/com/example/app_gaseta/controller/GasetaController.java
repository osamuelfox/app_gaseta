package com.example.app_gaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_gaseta.model.Gaseta;
import com.example.app_gaseta.view.GasetaActivity;


public class GasetaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public GasetaController(GasetaActivity gasetaActivity){

        preferences = gasetaActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }

    public Gaseta salvar(Gaseta gaseta) {

        Log.d("MVP_MVC_controller", "Salvo: " + gaseta.toString());

        listaVip.putString("Etanol", gaseta.getEdit_PrecoEtanol());
        listaVip.putString("Gasolina", gaseta.getEdit_PrecoGasolina());
        listaVip.putString("Resultado", gaseta.getResultado());
        listaVip.apply();
        return gaseta;
    }


    public Gaseta buscar(Gaseta outroGaseta){
        outroGaseta.setEdit_PrecoEtanol(preferences.getString("Etanol", ""));
        outroGaseta.setEdit_PrecoGasolina(preferences.getString("Gasolina", ""));
        outroGaseta.setResultado(preferences.getString("Resultado", ""));
        return outroGaseta;
    }

    public void limpar(){
        listaVip.clear();
        listaVip.apply();
    }

}
