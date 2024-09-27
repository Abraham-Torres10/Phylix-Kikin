package com.example.diagramaflujo;

public class Clasesita {

    protected int numerito;

    public void setNumerito(int numerito) {
        this.numerito = numerito;
    }

    public String numeros(){
        if (numerito > 14)
            return "quince";
        else
            if (numerito > 13)
                return "catorce";
            else
                if (numerito > 12)
                    return "trece";
                else
                    if (numerito > 11)
                        return "doce";
                    else
                        if (numerito > 10)
                            return "once";
                        else
                            if (numerito > 9)
                                return "diez";
                            else
                                if (numerito > 8)
                                    return "nueve";
                                else
                                    if (numerito > 7)
                                        return "ocho";
                                    else
                                        if (numerito > 6)
                                            return "siete";
                                        else
                                            if (numerito > 5)
                                                return "seis";
                                            else
                                                if (numerito > 4)
                                                    return "cinco";
                                                else
                                                    if (numerito > 3)
                                                        return "cuatro";
                                                    else
                                                        if (numerito > 2)
                                                            return "tres";
                                                        else
                                                            if (numerito > 1)
                                                                return "dos";
                                                            else
                                                                return "uno";
    }
}
