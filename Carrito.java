package com.example.kekas;

import java.util.ArrayList;

public class Carrito {

    private void agregarAlCarrito(Clasesita quesadilla) {
        for (QuesadillaCantidad q : carrito) {
            if (q.getQuesadilla().equals(quesadilla)) {
                q.incrementarCantidad();
                return;
            }
        }
        carrito.add(new QuesadillaCantidad(quesadilla, 1));
    }
    public ArrayList total(){
        String pago = "";
        for (int i = 0; i<kekitas.toArray().length; i++){
            pago = String.valueOf(kekitas.get(i));
        }
        return pago;
    }
}
