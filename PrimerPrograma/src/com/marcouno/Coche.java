package com.marcouno;

public class Coche {

    //ATRIBUTOS: CARACTERISTICAS QUE TENDRIA UN ELEMENTO Y QUE VARIA DE UN ELEMENTO A OTRO EJEMPLO:

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    int velocidadactual = 0;

    //CONSTRUCTORES: METODOS ESPECIALES QUE NOS PERMITIRAN CREAR OBJETOS DE ESTA CLASE EJEMPLO

    public Coche (){

    }

    public Coche (String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    //COMPORTAMIENTO: ACCIONES QUE SE LE PERMITE O SE LE ASIGNA AL OBJETO

    //ESTOS COMPORTAMIENTOS SON METODOS

    public void acelerar (int velocidad) {

        if (velocidadactual < 120) {
            this.velocidadactual += velocidad;
        }

    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidadactual=" + velocidadactual +
                '}';
    }
}
