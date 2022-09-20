package com.marcouno;

public class WhileLoop {
    public static void main(String[] args) {

        boolean check = true;

        int contador = 0;

        while (contador < 30) {

            contador ++; // CONDICION DE BREAK BUCLE

            if (contador == 6){
                System.out.println("Texto 2 " + contador);
                continue;
            }
            else if (contador >=10) {
                break;
            }

            System.out.println("Pueba texto 1 " + contador);

        }

    }
}
