package com.example.examensitobueno;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.parsers.SAXParser;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rbtoditos;
    RadioButton rbhombrecito, rbmujercita;
    Button seleccionadito;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        rbtoditos = findViewById(R.id.radiogrupo);

        rbhombrecito = findViewById(R.id.masculino);
        rbhombrecito.setOnClickListener(this);

        rbmujercita = findViewById(R.id.femenino);
        rbmujercita.setOnClickListener(this);

        seleccionadito = findViewById(R.id.botoncito);
        seleccionadito.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Clasesita objetito = new Clasesita();

        if (v.getId() == R.id.masculino)
            Toast.makeText(this, objetito.hombre(),
                    Toast.LENGTH_LONG).show();
        else
            if (v.getId() == R.id.femenino)
                Toast.makeText(this, objetito.mujer(),
                        Toast.LENGTH_LONG).show();
            else
                if (v.getId() == R.id.botoncito)
                    if (rbhombrecito.isChecked())
                        Toast.makeText(this, objetito.hombre(),
                                Toast.LENGTH_LONG).show();
                else
                    if (rbmujercita.isChecked())
                        Toast.makeText(this, objetito.mujer(),
                                Toast.LENGTH_LONG).show();
    }
}