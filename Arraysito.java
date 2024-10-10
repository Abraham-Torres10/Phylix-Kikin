package com.example.kekas;

import java.util.ArrayList;

public class Arraysito {
    ArrayList <Clasesita> kekitas = new ArrayList<>();

    public Arraysito() {
        kekitas.add(new Clasesita(0, "cual", 0));
        kekitas.add(new Clasesita(1, "queso", 30));
        kekitas.add(new Clasesita(2, "papa", 20));
        kekitas.add(new Clasesita(3, "picadillo", 40));
    }
    public ArrayList regresa(){
        return kekitas;
    }
    public ArrayList total(){
        String pago = "";
        for (int i = 0; i<kekitas.toArray().length; i++){
             pago = String.valueOf(kekitas.get(i));
        }
        return pago;
    }
}
