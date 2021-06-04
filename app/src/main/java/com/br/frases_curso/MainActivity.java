package com.br.frases_curso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

        String[] frases = {
                "frase 0 ",
                "frase 1",
                "frase 2",
                "frase 3",
        };

        int num = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResutado);
        texto.setText(frases[num]);

    }
}