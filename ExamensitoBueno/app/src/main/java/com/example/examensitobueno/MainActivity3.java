package com.example.examensitobueno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    Spinner comboBox;
    ArrayAdapter<String> adaptadito;
    String[] contenido = {"Selecciona Opción", "Saludo", "Regreso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        comboBox = findViewById(R.id.comboBox);
        comboBox.setOnItemSelectedListener(this);

        adaptadito = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, contenido);
        comboBox.setAdapter(adaptadito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String cadenita = parent.getItemAtPosition(position).toString();
        if (cadenita.equals("Saludo")) {
            Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show();
        } else
        if (cadenita.equals("Regreso")) {
            Intent intetito = new Intent(this, MainActivity.class);
            startActivity(intetito);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}