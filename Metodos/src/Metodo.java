public class Metodo {
    public static void main  (String[] Arg) {

        movil pieza1 = new movil();
        movil pieza2 = new movil();
        pieza3 Pieza3= new pieza3();
        ejecutaravanzar(pieza1);
        ejecutarretroceder(pieza2);
        ejecutaravanzar(Pieza3);
    }
    public static void ejecutaravanzar (direccion Pieza){
        Pieza.avanzar(1);
                };
    public static void ejecutarretroceder(direccion Pieza){
        Pieza.retroceder(1);
    }
}
interface direccion {
    void avanzar(int adelante);
    void retroceder(int atras);
}
class movil implements direccion {
    public void avanzar (int adelante) {
        System.out.println("avanzando");
    }
    public void retroceder (int retroceder) {
        System.out.println("retrocediendo");
    }
}
class pieza3 implements direccion {
    public void avanzar (int adelante) {
        System.out.println("Pieza 3 avanzando");
    }
    public void retroceder (int retroceder) {
        System.out.println("Pieza 3 retrocediendo");
    }
}