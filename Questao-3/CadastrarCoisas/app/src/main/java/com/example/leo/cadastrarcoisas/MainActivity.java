package com.example.leo.cadastrarcoisas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnProxTela;
    private EditText editNome;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        btnProxTela.setOnClickListener(v-> {
                startActivity(new Intent(this, ListaAtividadesActivity.class));

        });

    }

    private void setupViews() {
        btnProxTela = findViewById(R.id.btn_prox_tela);
        editNome = findViewById(R.id.edit_nome);
    }
}
