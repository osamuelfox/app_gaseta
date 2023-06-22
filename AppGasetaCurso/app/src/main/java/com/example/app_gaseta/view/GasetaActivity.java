package com.example.app_gaseta.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_gaseta.R;

public class GasetaActivity extends AppCompatActivity {

    EditText edit_PrecoGasolina;
    EditText edit_PrecoEtanol;
    TextView text_Resultado;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);

        edit_PrecoGasolina = findViewById(R.id.text_valor_gasolina);
        edit_PrecoEtanol = findViewById(R.id.text_valor_etanol);
        text_Resultado = findViewById(R.id.text_resultado);
    }

    public void calcular(View view){
        double gasolina = Double.parseDouble(edit_PrecoGasolina.getText().toString());
        double etanol = Double.parseDouble(edit_PrecoEtanol.getText().toString());
        double resultado = (etanol/gasolina);

        if(resultado <= 0.7){
            text_Resultado.setText(String.format("Alcool %.2f",resultado));

        }else {
            text_Resultado.setText(String.format("Gasolina %.2f",resultado));
        }
    }
}
