package com.example.app_gaseta.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app_gaseta.R;
import com.example.app_gaseta.controller.GasetaCalculo;
import com.example.app_gaseta.controller.GasetaController;
import com.example.app_gaseta.model.Gaseta;

public class GasetaActivity extends AppCompatActivity {

    EditText edit_PrecoGasolina;
    EditText edit_PrecoEtanol;
    TextView text_Resultado;

    Button btnbuton_Limpar;
    Button btnbuton_Finalizar;
    Button btnbuton_calcular;
    Button btnbuton_salvar;

    GasetaController gasetaController;
    Gaseta outroGaseta;
    Gaseta gaseta;

    GasetaCalculo gasetaCalculo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);

        gasetaController = new GasetaController(GasetaActivity.this);

        gasetaCalculo = new GasetaCalculo(GasetaActivity.this);
        gasetaCalculo.toString();

        gaseta = new Gaseta();

        outroGaseta = new Gaseta();
        gasetaController.buscar(outroGaseta);

        edit_PrecoGasolina = findViewById(R.id.text_valor_gasolina);
        edit_PrecoEtanol = findViewById(R.id.text_valor_etanol);
        text_Resultado = findViewById(R.id.text_resultado);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);
        btnbuton_calcular = findViewById(R.id.button_Calcular);
        btnbuton_salvar = findViewById(R.id.button_Salvar);

        esconder();

//        edit_PrecoEtanol.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
//                if ()
//                return false;
//            }
//        });


        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit_PrecoGasolina.setText("");
                edit_PrecoEtanol.setText("");
                text_Resultado.setText("Resultado");
                gasetaController.limpar();
                btnbuton_salvar.setEnabled(false);
            }
        });

        btnbuton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GasetaActivity.this, " Volte ", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnbuton_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_Resultado.setText("");
//
//                Toast.makeText(GasetaActivity.this,
//                        GasetaCalculo.calcular(), Toast.LENGTH_SHORT).show();

                double gasolina = Double.parseDouble(String.valueOf(edit_PrecoGasolina.getText()));
                double etanol = Double.parseDouble(String.valueOf(edit_PrecoEtanol.getText()));
                String Frase;

                gaseta.setEdit_PrecoGasolina(String.valueOf(gasolina));
                gaseta.setEdit_PrecoEtanol(String.valueOf(etanol));

                Frase = gasetaCalculo.calcular(gaseta);

                text_Resultado.setText(Frase);

                btnbuton_salvar.setEnabled(true);
            }
        });

        btnbuton_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outroGaseta.setEdit_PrecoEtanol(edit_PrecoEtanol.getText().toString());
                outroGaseta.setEdit_PrecoGasolina(edit_PrecoGasolina.getText().toString());
                outroGaseta.setResultado(text_Resultado.getText().toString());


                Toast.makeText(GasetaActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
                gasetaController.salvar(gaseta);

            }
        });
    }

    public void esconder(){

        String gasolina = edit_PrecoGasolina.getText().toString();
        String etanol = edit_PrecoEtanol.getText().toString();

        if(gasolina.isEmpty() || etanol.isEmpty()){

            Toast.makeText(GasetaActivity.this, " Preencha todos os campos ", Toast.LENGTH_SHORT).show();
            gasetaController.salvar(gaseta);

        }else {
            btnbuton_calcular.setVisibility(View.VISIBLE);
        }
    }
//    public void calcular(View view){
//
//        Gaseta gaseta = new Gaseta();
//
//        public void getResultado() {
//            double gasolina = Double.parseDouble(gaseta.getEdit_PrecoGasolina().toString());
//            double etanol = Double.parseDouble(gaseta.getEdit_PrecoEtanol().toString());
//            double resultado = (etanol/gasolina);
//
//            if(resultado() <= 0.7){
//                text_Resultado.setText(String.format("Alcool %.2f",gaseta.getResultado()));
//
//            }else {
//                text_Resultado.setText(String.format("Gasolina %.2f",gaseta.getResultado()));
//            }
//        }
//    }

}