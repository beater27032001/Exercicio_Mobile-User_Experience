package com.example.userexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private int imagemClicada = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton button = findViewById(R.id.floatingActionButton);

        ImageView img1 = findViewById(R.id.ivDonuts);
        ImageView img2 = findViewById(R.id.ivBiscoito);
        ImageView img3 = findViewById(R.id.ivSorvete);

        img1.setOnClickListener(view -> {
            imagemClicada = 1;
            Toast.makeText(this, "Donuts", Toast.LENGTH_LONG).show();
        });

        img2.setOnClickListener(view -> {
            imagemClicada = 2;
            Toast.makeText(this, "Biscoito", Toast.LENGTH_LONG).show();
        });

        img3.setOnClickListener(view -> {
            imagemClicada = 3;
            Toast.makeText(this, "Sorvete", Toast.LENGTH_LONG).show();
        });

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);

            intent.putExtra("KEY_TELA1", imagemClicada);

            startActivity(intent);
        });
    }
}