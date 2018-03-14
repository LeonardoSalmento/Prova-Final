package com.example.leo.testandohj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnProxTela;
    private EditText edtNome;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        salvarNome(nome);

        btnProxTela.setOnClickListener(v-> {
            startActivity(new Intent(this,ColocarNotasActivity.class));

        });


    }

    private void salvarNome(String nome) {
        nome = edtNome.getText().toString();
        final SharedPreferences preferences = getSharedPreferences("nomeUsuario.file", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("nomeUsuario",nome);

        editor.commit();
    }

    private void setupViews() {
        btnProxTela = findViewById(R.id.btn_prox_tela);
        edtNome = findViewById(R.id.edit_nome);
    }
}
