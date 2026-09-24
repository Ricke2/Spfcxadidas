package com.example.spfcxadidas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            ImageButton botaoFechar = findViewById(R.id.imageButton);
            botaoFechar.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity3.this,
                        MainActivity2.class);
            startActivity(intent);
        });

        Button botaoAdidas = findViewById(R.id.button7);
        botaoAdidas.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this,
                    MainActivity.class);

            startActivity(intent);
        });

        Button botaoAvançar= findViewById(R.id.button4);
        botaoAvançar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this,
                    MainActivity4.class);

            startActivity(intent);
        });


    }
}