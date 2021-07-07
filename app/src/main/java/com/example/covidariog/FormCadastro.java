package com.example.covidariog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class FormCadastro extends AppCompatActivity {

    private EditText edit_nome,edit_email,edit_senha;
    private Button bt_cadastrar;
    String[] mensagem = {"Preencha todos os campos", "Cadastro realizado com sucesso"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edit_nome.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if(nome.isEmpty() || email.isEmpty() || senha.isEmpty() ){
                    Snackbar snackbar = Snackbar.make(v,mensagem[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else{}
            }
        });
    }

    private void IniciarComponentes(){
        edit_nome = findViewById(R.id.editText_CadNome);
        edit_email = findViewById(R.id.editText_CadEmail);
        edit_senha = findViewById(R.id.editText_CadSenha);
        bt_cadastrar = findViewById(R.id.btn_Cadastrar);

    }
}