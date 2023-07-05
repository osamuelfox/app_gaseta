package com.example.app_gaseta.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_gaseta.model.Gaseta;
import com.example.app_gaseta.view.GasetaActivity;

public class GasetaCalculo {


    public GasetaCalculo(GasetaActivity mainActivity){

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }
    public String calcular(Gaseta gaseta){

        double gasolina = Double.parseDouble(gaseta.getEdit_PrecoGasolina());
        double etanol = Double.parseDouble(String.valueOf(gaseta.getEdit_PrecoEtanol()));
        double resultado = (gasolina / etanol);

        String frase;

        if(resultado <= 0.70){
            frase = String.format("Resultado: Melhor opção abasteça c/ Etanol %.2f", resultado);

        } else {
            frase = String.format("Resultado: Melhor opção abasteça c/ Gasolina %.2f", resultado);
        }

        return frase;
    }
}
