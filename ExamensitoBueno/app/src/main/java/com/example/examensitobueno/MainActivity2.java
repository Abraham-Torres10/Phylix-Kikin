package com.example.examensitobueno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText editadito1, editadito2, editadito3;
    Button mayor, menor, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        editadito1 = findViewById(R.id.editadito1);
        editadito2 = findViewById(R.id.editadito2);
        editadito3 = findViewById(R.id.editadito3);
        mayor = findViewById(R.id.mayor);
        menor = findViewById(R.id.menor);
        regresar = findViewById(R.id.regresar);

        mayor.setOnClickListener(this);
        menor.setOnClickListener(this);
        regresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        Clasesita objetito = new Clasesita(Integer.parseInt(editadito1.getText().toString()),
                Integer.parseInt(editadito2.getText().toString()),
                Integer.parseInt(editadito3.getText().toString()));
        if(cadenita.equals("Mayor"))
            Toast.makeText(this, "El mayor es: " + objetito.mayor(), Toast.LENGTH_SHORT).show();
        else
            if(cadenita.equals("Menor"))
                Toast.makeText(this, "El menor es: " + objetito.menor(), Toast.LENGTH_SHORT).show();
            else
            if(cadenita.equals("Regresar")) {
                Intent intetito = new Intent(this, MainActivity.class);
                startActivity(intetito);
            }
        }
}