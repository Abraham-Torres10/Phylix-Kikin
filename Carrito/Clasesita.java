package com.example.kekas;

public class Clasesita {
    private int clave;
    private String deque;
    private int costo;
    private int cuantitas;

    public Clasesita(int clave, String deque, int costo) {
        this.clave = clave;
        this.deque = deque;
        this.costo = costo;
    }

    public Clasesita() {
    }

    public int getClave() {
        return clave;
    }

    public String toString() {
        return deque;
    }

    public String cuantas(String cuantitas){
        return cuantitas;
    }

    public int getCosto() {
        return costo;
    }
}

