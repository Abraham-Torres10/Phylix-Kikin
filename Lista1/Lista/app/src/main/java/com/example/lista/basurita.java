package com.example.lista;

import java.util.ArrayList;

public class basurita {

    private ArrayList<String> listita;

    public basurita() {
        listita = new ArrayList<String>();
        lista();
    }

    public void lista(){
        listita.add("Enero");
        listita.add("Febrero");
        listita.add("Marzo");
        listita.add("Abril");
        listita.add("Mayo");
        listita.add("Junio");
        listita.add("Julio");
        listita.add("Agosto");
        listita.add("Septiembre");
        listita.add("Octubre");
        listita.add("Noviembre");
        listita.add("Diciembre");
    }

    public ArrayList<String> getListita() {
        return listita;
    }
}
