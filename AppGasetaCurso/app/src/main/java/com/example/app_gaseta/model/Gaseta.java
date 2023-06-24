package com.example.app_gaseta.model;

public class Gaseta {

    private double edit_PrecoGasolina;
    private double edit_PrecoEtanol;

    public Gaseta (){

    }

    public Gaseta(double edit_PrecoGasolina, double edit_PrecoEtanol) {
        this.edit_PrecoGasolina = edit_PrecoGasolina;
        this.edit_PrecoEtanol = edit_PrecoEtanol;
    }

    public double getEdit_PrecoGasolina() {
        return edit_PrecoGasolina;
    }

    public void setEdit_PrecoGasolina(double edit_PrecoGasolina) {
        this.edit_PrecoGasolina = edit_PrecoGasolina;
    }

    public double getEdit_PrecoEtanol() {
        return edit_PrecoEtanol;
    }

    public void setEdit_PrecoEtanol(double edit_PrecoEtanol) {
        this.edit_PrecoEtanol = edit_PrecoEtanol;
    }

    @Override
    public String toString() {
        return "Gaseta{" +
                "edit_PrecoGasolina=" + edit_PrecoGasolina +
                ", edit_PrecoEtanol=" + edit_PrecoEtanol +
                '}';
    }

}
