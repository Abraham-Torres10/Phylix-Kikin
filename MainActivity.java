package com.example.kekas;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner combito;
    ArrayAdapter adaptadorsito;
    EditText cuantas;
    Arraysito kekitas;
    ArrayList<Clasesita> regreso = new ArrayList<>();
    TextView vistita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        vistita = findViewById(R.id.vista);
        kekitas = new Arraysito();
        cuantas = findViewById(R.id.cuantas);
        regreso = kekitas.regresa();


        combito = findViewById(R.id.combo);

        combito.setOnItemSelectedListener(this);

        adaptadorsito = new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                regreso);
        combito.setAdapter(adaptadorsito);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Clasesita objetito = new Clasesita();
        Clasesita totalito = new Clasesita();
        String quesadillas = "";
        String cadenita = ((Button) view).getText().toString();
        quesadillas = cuantas.getText().toString();

        if (position > 0) {
            objetito = (Clasesita) combito.getSelectedItem();
            cadenita = "Clave: " + objetito.getClave() + "\n" +
                    "De: " + objetito.toString() + "\n" +
                    "Son: " + objetito.cuantas(quesadillas) + "\n" +
                    "Costo: $" + objetito.getCosto();
            vistita.setText(cadenita);
        }
        if (cadenita.equals("Añadir al carrito"))
        Toast.makeText(this,"Agregado", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Total: " + kekitas.total(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}