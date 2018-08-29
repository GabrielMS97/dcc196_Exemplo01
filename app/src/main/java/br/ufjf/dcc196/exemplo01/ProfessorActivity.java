package br.ufjf.dcc196.exemplo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfessorActivity extends AppCompatActivity {

    private TextView txtProfMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtProfMensagem = findViewById(R.id.txt_profMensagem);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String nome = extras.getString(MainActivity.PESSOA_NOME);
            txtProfMensagem.setText("Olá professor " + nome);
        }
    }
}
