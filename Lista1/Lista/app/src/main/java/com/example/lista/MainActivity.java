package com.example.lista;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listita;
    ArrayList<String> regresa = new ArrayList<String>();
    basurita mesesitos = new basurita();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listita = findViewById(R.id.lista);
        listita.setOnItemClickListener(this);
        regresa = mesesitos.getListita();

        ArrayAdapter<String> adaptadito = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, regresa);
        listita.setAdapter(adaptadito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
    }
}
