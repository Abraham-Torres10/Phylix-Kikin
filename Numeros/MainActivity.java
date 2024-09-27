package com.example.diagramaflujo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View
        .OnClickListener{
    Button botoncito;
    EditText numerito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        botoncito = findViewById(R.id.botoncito);
        botoncito.setOnClickListener(this);
        numerito = findViewById(R.id.numerito);
    }

    @Override
    public void onClick(View view) {
        String n = ((Button)view).getText().toString();
        Clasesita objetito = new Clasesita();
        objetito.setNumerito(Integer.parseInt(numerito.getText().toString()));
        Toast.makeText(this, objetito.numeros(),Toast.LENGTH_LONG).show();
    }
}