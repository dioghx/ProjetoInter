package com.example.labdesenvolvimento.projetointerdiego;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogarActivity extends Activity {

    private EditText editTextEmail;
    private EditText editTextSenha;
    private Button buttonLogar;
    private Button buttonCadastrar;
    private Filme filme;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logar);
        buttonLogar = (Button)findViewById(R.id.buttonLogar);
        buttonCadastrar = (Button)findViewById(R.id.buttonCadastrar);
    }



}
