package com.example.numeritos;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener {

    EditText tetito;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Metodos net = new Metodos();
        tetito = findViewById(R.id.textito);
        tetito.setOnKeyListener(this);

        textView = findViewById(R.id.vistita);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_UP){
            String textote = tetito.getText().toString();
            Metodos met = new Metodos();
            if (textote.length() == 1){
                int numero = Integer.parseInt(textote);
                textView.setText(met.unacifra(numero));
            }else {
                if (textote.length()==0) {
                    textView.setText("");
                }
                    else
                        if(textote.length()==2){
                            textView.setText(met.doscifras((textote)));
                        }
                        else
                            if(textote.length()==3){
                                textView.setText(met.trescifras((textote)));
                            }
                            else
                                if(textote.length()==4){
                                    textView.setText(met.cuatrocifras((textote)));
                                }
                                else
                                    if(textote.length()==5){
                                        textView.setText(met.cincocifras((textote)));
                                    }
                                    else
                                        if(textote.length()==6){
                                            textView.setText(met.seiscifras((textote)));
                                        }

            }
        }
        return false;
    }
}