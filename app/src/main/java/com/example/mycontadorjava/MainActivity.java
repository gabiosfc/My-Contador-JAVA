package com.example.mycontadorjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referências aos elementos do layout
        TextView textContador = findViewById(R.id.textView);
        Button btnAumentar = findViewById(R.id.activity_main_btn_aumentar);
        Button btnDiminuir = findViewById(R.id.activity_main_btn_diminuir);

        // Inicializa o valor do contador na TextView
        textContador.setText(String.valueOf(contador));

        // Desativa o botão "Diminuir" inicialmente se o contador for 0
        btnDiminuir.setEnabled(contador > 0);

        // Lógica para o botão "Aumentar"
        btnAumentar.setOnClickListener(v -> {
            contador++;
            textContador.setText(String.valueOf(contador));
            // Ativa o botão "Diminuir" se o contador for maior que 0
            btnDiminuir.setEnabled(contador > 0);
        });

        // Lógica para o botão "Diminuir"
        btnDiminuir.setOnClickListener(v -> {
            if (contador > 0) {
                contador--;
                textContador.setText(String.valueOf(contador));
            }
            // Desativa o botão "Diminuir" se o contador for 0
            btnDiminuir.setEnabled(contador > 0);
        });
    }
}
