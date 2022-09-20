package com.marcouno;

public class CocheMAin {
    public static void main(String[] args) {

        String coche ="alfa romeo";

        Coche cocheuno = new Coche();

        Coche cochedos = new Coche("rojo", "Fiat", "Uno", 1900.0, 3.2);
        System.out.println(cochedos);
        cochedos.acelerar(50);
        System.out.println(cochedos);

    }
}
