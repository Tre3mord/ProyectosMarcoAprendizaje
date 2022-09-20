package OtraTarea;

public class OtraTareaObjetos {

    public static void main(String[] Arg) {

        vestuario pantalon = new vestuario();
        pantalon.setColorVestimenta("Azul");
        String cantidadPiernas = pantalon.getColorVestimenta();
        System.out.println(cantidadPiernas);

        System.out.println(pantalon.orificios);
        pantalon.aumentarOrificios();
        pantalon.aumentarOrificios();
        System.out.println(pantalon.orificios);

        vestuario chaleco = new vestuario();
        chaleco.setColorVestimenta("Amarillo");
        System.out.println(chaleco.getColorVestimenta());
        System.out.println(chaleco.orificios);

    }
}
    class vestuario {

    int orificios;

         private String colorVestimenta;
         public void setColorVestimenta (String colorVestimenta) {
             this.colorVestimenta = colorVestimenta;
         }

         public String getColorVestimenta () {
             return this.colorVestimenta;
         }

         public void aumentarOrificios () {
             orificios += 1;
         }

    }


