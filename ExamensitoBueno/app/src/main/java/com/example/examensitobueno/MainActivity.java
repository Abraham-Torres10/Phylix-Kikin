package com.example.examensitobueno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button actividad1, actividad2, actividad3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        actividad1 = findViewById(R.id.actividad1);
        actividad2 = findViewById(R.id.actividad2);
        actividad3 = findViewById(R.id.actividad3);

        actividad1.setOnClickListener(this);
        actividad2.setOnClickListener(this);
        actividad3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        if(cadenita.equals("Actividad 1")) {
            Intent intetito = new Intent(this, MainActivity2.class);
            startActivity(intetito);
        } else
            if(cadenita.equals("actividad 2")) {
                Intent intetito = new Intent(this, MainActivity3.class);
                startActivity(intetito);
            }
            if(cadenita.equals("Actividad 3")) {
                Intent intetito = new Intent(this, MainActivity4.class);
                startActivity(intetito);
            }
    }
}