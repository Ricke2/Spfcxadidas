package com.example.spfcxadidas;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button botaoEntrar = findViewById(R.id.button5);
        botaoEntrar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,
                    MainActivity2.class);

            startActivity(intent);
        });
        Button botaoColecao = findViewById(R.id.button2);
        botaoColecao.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,
                    MainActivity2.class);

            startActivity(intent);
        });
        Button botaoConhecer = findViewById(R.id.button);
        botaoConhecer.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,
                    MainActivity2.class);

            startActivity(intent);
        });

    }
}