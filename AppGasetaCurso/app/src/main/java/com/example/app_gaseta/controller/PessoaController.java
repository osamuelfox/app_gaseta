package com.example.app_gaseta.controller;

//public class PessoaController {
//
//    SharedPreferences preferences;
//    SharedPreferences.Editor listaVip;
//
//    public static final String NOME_PREFERENCES = "pref_listavip";
//
//    public PessoaController(MainActivity mainActivity){
//
//        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
//        listaVip = preferences.edit();
//    }
//
//    @NonNull
//    @Override
//    public String toString() {
//        Log.d("MVC_controller", "Controller Iniciado");
//        return super.toString();
//    }
//
//    public Pessoa salvar(Pessoa outraPessoa) {
//
//        Log.d("MVP_MVC_controller", "Salvo: " + outraPessoa.toString());
//
//        listaVip.putString("primeiroNome", outraPessoa.getNome());
//        listaVip.putString("sobreNome", outraPessoa.getSobreNome());
//        listaVip.putString("nomeCurso", outraPessoa.getNomeCurso());
//        listaVip.putString("telefone", outraPessoa.getTelefone());
//        listaVip.apply();
//        return outraPessoa;
//    }
//
//
//    public Pessoa buscar(Pessoa outraPessoa){
//        outraPessoa.setNome(preferences.getString("primeiroNome", ""));
//        outraPessoa.setSobreNome(preferences.getString("sobreNome", ""));
//        outraPessoa.setNomeCurso(preferences.getString("nomeCurso", ""));
//        outraPessoa.setTelefone(preferences.getString("telefone", ""));
//        return outraPessoa;
//    }
//
//    public void limpar ( Pessoa pessoa ){
//        listaVip.clear();
//        listaVip.apply();
//
//    }
//
//
//}