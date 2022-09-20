package SegundaTarea;

public class SegundaTarea {

    public static void main (String[] arg) {
        int numeroif = -1;

        if (numeroif >= 0) {
            System.out.println("El Valor es positivo");
        } else {
            System.out.println("El valor es negativo");
        }
        ;

        int numeroWhile = 0;

        while (numeroWhile <= 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        ;

        int numeroDoWhile = 0;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 3;
        } while (numeroDoWhile < 3);


        for (int numeroFor = 0;numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        };

        var estacion = "Invierno";

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");};


    }
    }

