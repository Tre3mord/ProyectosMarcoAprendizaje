package com.marcouno;

public class IfElse {
    public static void main(String[] args) {

        boolean check = 5<10;

        int numero1 = 11;
        int numero2 = 10;
        int numero3 = 20;

        boolean comprobacion = numero1 < numero2;

        if(comprobacion){
            System.out.println("Verdadero");
        }
        else{
            System.out.println("Falso");
        }

        if(numero1 < numero2 && numero2 < numero3){
            System.out.println("Primera condicion");
        }
        else if (numero1 < numero2 + numero3) {
            System.out.println("Segunda condicion");
        }

        if (check){
            System.out.println("verdadero");
        }

        if (5<10){
            System.out.println("verdadero");
        }
    }
}
