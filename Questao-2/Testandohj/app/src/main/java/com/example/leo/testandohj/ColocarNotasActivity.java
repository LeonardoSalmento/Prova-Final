package com.example.leo.testandohj;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ColocarNotasActivity extends AppCompatActivity {

    private EditText editNota1;
    private EditText editNota2;
    private Button btnCalcularMedia;
    private TextView tvMensagem;
    private Double nota1;
    private Double nota2;
    private Double media;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocar_notas);

        setupViews();
        obterNotas();
        media = recuperarMedia();
        nome = pegarNome();
        mensagem();

        btnCalcularMedia.setOnClickListener(v-> {
                Intent intent = new Intent(this,PesoNotasActivity.class);
                intent.putExtra("nota1",nota1);
                intent.putExtra("nota2",nota2);
                startActivity(intent);
                finish();


        });
    }

    private void obterNotas() {
        nota1 = Double.valueOf(editNota1.getText().toString());
        nota2 = Double.valueOf(editNota2.getText().toString());

    }

    private void setupViews() {
        editNota1 = findViewById(R.id.edit_nota_1);
        editNota2 = findViewById(R.id.edit_nota_2);
        btnCalcularMedia = findViewById(R.id.btn_calcular_media);
        tvMensagem = findViewById(R.id.tv_mensagem);

    }

    private Double recuperarMedia(){
        Intent intent = getIntent();
        Double mediaFinal = intent.getDoubleExtra("media",-1);

        return mediaFinal;
    }

    private String pegarNome(){
        SharedPreferences preferences = getSharedPreferences("nomeUsuario.file", MODE_PRIVATE);
        final String nomeUsuario = preferences.getString("nomeUsuario","nao achou");
        return nomeUsuario;
    }

    private void mensagem(){
        if (media < 4){
            tvMensagem.setText("Sinto muito " + nome + " você ficou reprovado. Sua média foi " + media);
        }else if(media>4 && media <= 6.9999){
            tvMensagem.setText(nome + " cuidado, você ficou em prova final. Sua média foi " + media + " e voce precisa tirar " + calcularMedia() + " para obter a aprovacao.");
        }else if (media>7){
            tvMensagem.setText("Parabens " + nome + ", você ficou aprovado com média " + media);
        }else{
            tvMensagem.setText("");
        }
    }

    private Double calcularMedia() {
        return (14 - media);
    }
}
