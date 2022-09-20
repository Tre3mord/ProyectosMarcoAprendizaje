package com.marcouno;

public class Funciones {
    public static void main(String[] args) {
        //METODOS O FUNCIONES
        //METODO: CUANDO ESTEMOS ORIENTADOS A OBJETOS
        //FUNCIONES: CUANDO NO ESTEMOS ORIENTADOS A OBJETOS O COMPORTAMIENTO DE UN OBJETO
        //SON AGRUPACIONES DE SENTENCIAS QUE VAN A PODER SER UTILIZADAS EN CUALQUIER PARTE DE NUESTRA APLICACION
        
        // holaMundo();
        holaMundo("Alan");
        holaMundo("Marco");
        String hola = devolverHola();
        System.out.println(hola);

        //CUANDO PASAMOS VALORES ENTRE LOS PARENTESIS SE LLAMA ARGUMENTO
    }

    // LO QUE SE ENCUENTRA ENTRE PARENTESIS EN LA FUNCION ES UN PARAMETRO AL CUAL SE LE ASIGNA UN ARGUMENTO CUANDO SE LLAMA DESDE FUERA
    public static void holaMundo(String name) {
        System.out.println("Hola " + name);
    };



    //CUANDO SE ASIGNA UN TIPO A LA FUNCION O METODO; DEBE UTILIZAR RETURN PARA PODER LLAMARLO Y ADEMAS HAY QUE ASIGNAR UN PARAMETRO Y LLAMADA AL PARAMETRO
    private static String devolverHola(){
        return "Hola";
    }

    public static int suma (int A, int B){
        int resultado = A + B;
        return resultado;
    }

    public static int suma (int A, int B, int C){
        return A + B + C;
    }

    protected static int suma (int A, int B, int C, int D){
        return A + B + C + D;
    }

}
