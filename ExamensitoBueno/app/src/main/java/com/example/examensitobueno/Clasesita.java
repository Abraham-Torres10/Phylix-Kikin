package com.example.examensitobueno;

public class Clasesita {
    private int dato1;
    private int dato2;
    private int dato3;

    public Clasesita () {}

    public Clasesita(int dato1, int dato2, int dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public int mayor() {
        if (dato1 > dato2) {
            if (dato1 > dato3) {
                return dato1;
            } else {
                return dato3;
            }
        } else
            if(dato2 > dato3) {
                return dato2;
            } else {
                return  dato3;
            }
    }

    public int menor() {
        if (dato1 < dato2) {
            if (dato1 < dato3) {
                return dato1;
            } else {
                return dato3;
            }
        } else
        if(dato2 < dato3) {
            return dato2;
        } else {
            return  dato3;
        }
    }

    public String hombre() {
        return "eres hombre";
    }

    public String mujer() {
        return "eres mujer";
    }
}
