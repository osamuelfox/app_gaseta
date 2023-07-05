package com.example.app_gaseta.view;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    Pessoa pessoa;
//    Pessoa outraPessoa;
//    List<String> nomesDoCurso;
//
//    PessoaController controller;
//    CursoController cursoController;
//
//    EditText editNome;
//    EditText editSobrenome;
//    EditText editNomeCurso;
//    EditText editTelefone;
//
//    Button btnbuton_Limpar;
//    Button btnbuton_Salvar;
//    Button btnbuton_Finalizar;
//
//    Spinner spinner;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        cursoController = new CursoController();
//
//        nomesDoCurso = cursoController.dadosSpinner();
//
//        cursoController.getListaCurso();
////
////        Spinner listaDeCursos = findViewById(R.id.ListaSpinner);
////        listaDeCursos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cursoController.getCursos()));
//
//        controller = new PessoaController(MainActivity.this);
//        controller.toString();
//
//        outraPessoa = new Pessoa();
//        controller.buscar(outraPessoa);
//
//        editNome = findViewById(R.id.text_valor_gasolina);
//        editSobrenome = findViewById(R.id.text_valor_etanol);
//        editNomeCurso = findViewById(R.id.text_consumoPorGasolina);
//        editTelefone = findViewById(R.id.text_consumoPorEtanol);
//
//        btnbuton_Limpar = findViewById(R.id.button_Limpar);
//        btnbuton_Salvar = findViewById(R.id.button_Salvar);
//        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);
//
//        editNome.setText(outraPessoa.getNome());
//        editSobrenome.setText(outraPessoa.getSobreNome());
//        editNomeCurso.setText(outraPessoa.getNomeCurso());
//        editTelefone.setText(outraPessoa.getTelefone());
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cursoController.dadosSpinner());
//
//        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
//
//        spinner.setAdapter(adapter);
//
//        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                editNome.setText("");
//                editSobrenome.setText("");
//                editNomeCurso.setText("");
//                editTelefone.setText("");
//            }
//        });
//
//        btnbuton_Finalizar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, " Volte ", Toast.LENGTH_SHORT).show();
//                finish();
//            }
//        });
//
//        btnbuton_Salvar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                outraPessoa.setNome(editNome.getText().toString());
//                outraPessoa.setSobreNome(editSobrenome.getText().toString());
//                outraPessoa.setNomeCurso(editNomeCurso.getText().toString());
//                outraPessoa.setTelefone(editTelefone.getText().toString());
//
//                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
//                controller.salvar(outraPessoa);
//
//            }
//        });
//
//        Log.i("ProgramacaoPOO", outraPessoa.toString());
//
//    }
}