package com.example.userexperience;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int imagemSelecionada = getIntent().getIntExtra("KEY_TELA1", 0);

        TextView tv = findViewById(R.id.textView10);

        String doce = "";

        if(imagemSelecionada == 1) doce = "Donut";
        else if(imagemSelecionada == 2) doce = "Biscoito";
        else if (imagemSelecionada == 3) doce = "Sorvete";
        else doce = "Não encontrado";

        tv.setText(doce);
    }
}