package com.example.numeritos;

public class Metodos {
    String unidades[] = {"", "uno","dos","tres","cuatro","cinco",
            "seis","siete","ocho","nueve","diez"};
    String decenas[] = {"","diez","veinte","treinta","cuarenta",
            "cincuenta","sesenta","setenta","ochenta","noventa"};
    String centenas[] = {"","cien","doscientos","trescientos","cuatrocientos",
            "quinientos","seiscientos","setecientos","ochocientos","novecientos"};

    String miles = "mil";

    String veintes[] = {"","veintiuno","veintidos","veintitres","veinticuatro",
            "veinticinco","veintiseis","veintisiete","veintiocho","veintinueve"};

    String dieces[] = {"","once","doce","trece","catorce",
            "quince","dieciseis","diecisiete","dieciocho","diecinueve"};


    public String unacifra (int numero){
        return unidades [numero];
    }

    public String doscifras (String textote){

        int decenita = Integer.parseInt(textote.substring(0, 1));
        int unidadcita = Integer.parseInt(textote.substring(1, 2));

        if(unidadcita==0)
            return decenas[decenita];
        else {
            if (Integer.parseInt(textote) > 20 && Integer.parseInt(textote) <= 30)
                return veintes[unidadcita];
            else if (Integer.parseInt(textote) < 16 && Integer.parseInt(textote) >= 11)
                return dieces[unidadcita];
            else
                return decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String trescifras (String textote){

        int centenita = Integer.parseInt(textote.substring(0, 1));
        int decenita = Integer.parseInt(textote.substring(1, 2));
        int unidadcita = Integer.parseInt(textote.substring(2, 3));

        if(unidadcita==0 && decenita==0)
            return centenas[centenita];
        else {
            if (Integer.parseInt(textote.substring(1,3)) > 20 && Integer.parseInt(textote.substring(1,3)) <= 30)
                return centenas[centenita] + " " + veintes[unidadcita];
            else if (Integer.parseInt(textote.substring(1,3)) < 20 && Integer.parseInt(textote.substring(1,3)) >= 11)
                return centenas[centenita] + " " + dieces[unidadcita];
            else
                if (unidadcita==0)
                    return centenas[centenita] + " " + decenas[decenita];
                else
                    return centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String cuatrocifras (String textote){

        int mil = Integer.parseInt(textote.substring(0, 1));
        String resto = textote.substring(1);

        if (resto.equals("000")) {
            return (mil == 1) ? miles : unidades[mil] + " " + miles;
        } else {
            return (mil == 1 ? miles : unidades[mil] + " " + miles) + " " + trescifras(resto);
        }
    }

    public String cincocifras (String textote){

        int decenaMil = Integer.parseInt(textote.substring(0, 2));
        String resto = textote.substring(2);

        if (decenaMil == 10) {
            return "diez mil " + trescifras(resto);
        } else if (decenaMil > 10 && decenaMil < 20) {
            return dieces[decenaMil - 10] + " mil " + trescifras(resto);
        } else if (decenaMil >= 20 && decenaMil < 30) {
            return veintes[decenaMil - 20] + " mil " + trescifras(resto);
        } else {
            return doscifras(textote.substring(0, 2)) + " mil " + trescifras(resto);
        }
    }

    public String seiscifras(String textote) {

        int centenaMil = Integer.parseInt(textote.substring(0, 1));
        String resto = textote.substring(1);

        if (resto.equals("00000")) {
            return centenas[centenaMil] + " mil";
        } else if (resto.startsWith("0000")) {
            return centenas[centenaMil] + " mil " + unacifra(Integer.parseInt(resto.substring(4)));
        } else {
            return centenas[centenaMil] + " " + cincocifras(resto).replace(" y", "");
        }
    }

}
