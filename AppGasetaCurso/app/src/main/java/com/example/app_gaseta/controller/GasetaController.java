package com.example.app_gaseta.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_gaseta.model.Gaseta;
import com.example.app_gaseta.view.GasetaActivity;

public class GasetaController {


    public GasetaController(GasetaActivity mainActivity){



    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }
    public String calcular(Gaseta gaseta){

        double gasolina = gaseta.getEdit_PrecoGasolina();
        double etanol = gaseta.getEdit_PrecoEtanol();
        double resultado = (gasolina / etanol);

        String frase;

        if(resultado <= 0.70){
            frase = "Resultado" + resultado + "Etanol";
        } else {
            frase = "Resultado" + resultado + "Gasolina";
        }

        return frase;
    }

}
