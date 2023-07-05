package com.example.app_gaseta.model;

public class Gaseta {

    private String edit_PrecoGasolina;
    private String edit_PrecoEtanol;
    private String resultado;

    public Gaseta (){
    }

    public Gaseta(String edit_PrecoGasolina, String edit_PrecoEtanol, String resultado) {
        this.edit_PrecoGasolina = edit_PrecoGasolina;
        this.edit_PrecoEtanol = edit_PrecoEtanol;
        this.resultado = resultado;
    }

    public String getEdit_PrecoGasolina() {
        return edit_PrecoGasolina;
    }

    public void setEdit_PrecoGasolina(String edit_PrecoGasolina) {
        this.edit_PrecoGasolina = edit_PrecoGasolina;
    }

    public String getEdit_PrecoEtanol() {
        return edit_PrecoEtanol;
    }

    public void setEdit_PrecoEtanol(String edit_PrecoEtanol) {
        this.edit_PrecoEtanol = edit_PrecoEtanol;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Gaseta{" +
                "edit_PrecoGasolina='" + edit_PrecoGasolina + '\'' +
                ", edit_PrecoEtanol='" + edit_PrecoEtanol + '\'' +
                '}';
    }
}
