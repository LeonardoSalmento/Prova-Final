package com.example.leo.testandohj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PesoNotasActivity extends AppCompatActivity {

    private EditText editPeso1;
    private EditText editPeso2;
    private Button btnCalcular;
    private Double nota1;
    private Double peso1;
    private Double nota2;
    private Double peso2;
    private Double media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_notas);

        setupViews();

        setandoValores();
        obterNotas();

        calcularMedia();

        btnCalcular.setOnClickListener(v -> {

            Intent intent = new Intent(this,ColocarNotasActivity.class);
            intent.putExtra("media",media);
            startActivity(intent);
            finish();

        });


    }

    private void setandoValores() {
        peso1 = Double.valueOf(editPeso1.getText().toString());
        peso2 = Double.valueOf(editPeso2.getText().toString());
    }

    private void calcularMedia() {
        media = ((nota1 * peso1) + (nota2* peso2)) / (peso1 + peso2);
    }

    private void obterNotas() {
        Intent intent = getIntent();
        nota1 = intent.getDoubleExtra("nota1",-1);
        nota2 = intent.getDoubleExtra("nota2",-1);


    }

    private void setupViews() {
        editPeso1 = findViewById(R.id.edit_peso_1);
        editPeso2 = findViewById(R.id.edit_peso_2);
        btnCalcular = findViewById(R.id.btn_calcular);
    }
}
