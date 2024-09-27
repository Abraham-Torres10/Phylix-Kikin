package com.example.lista_operaciones;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView operaciones;
    EditText num1, num2;
    ArrayList<String> resultados = new ArrayList<String>();
    Numeritos resultado = new Numeritos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        operaciones=findViewById(R.id.lista);
        operaciones.setOnItemClickListener(this);
        resultados= resultado.getOperacion();
        num1=findViewById(R.id.numero1);
        num1.getText().toString();
        num2=findViewById(R.id.numero2);
        num2.getText().toString();

        ArrayAdapter<String> adaptadito = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,resultados);

        operaciones.setAdapter(adaptadito);

        operaciones.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String seleccion = resultados.get(i);

        resultado.setNumero1(Integer.parseInt(num1.getText().toString()));
        resultado.setNumero2(Integer.parseInt(num2.getText().toString()));
        if (seleccion.equals("Suma"))
            Toast.makeText(this, "El resultado es: " + resultado.sumita(), Toast.LENGTH_LONG).show();
        else
            if (seleccion.equals("Resta"))
                Toast.makeText(this, "El resultado es: " + resultado.restita(), Toast.LENGTH_SHORT).show();
            else
                if (seleccion.equals("Multiplicación"))
                    Toast.makeText(this, "El resultado es: " + resultado.multiplicacionsita(), Toast.LENGTH_SHORT).show();
                else
                    if (seleccion.equals("División")) {
                        if (resultado.numero2 == 0)
                            Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(this, "El resultado es: " + resultado.divisionsita(), Toast.LENGTH_LONG).show();
                    }
    }
}