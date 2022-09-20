public class Herencia {

    public static void main (String[] Arg) {

        Coche suv = new Coche();
        suv.matriculaVehiculo = "ABC123";
        suv.setTipoGasolina("bencina");
        System.out.println(suv.matriculaVehiculo);
        System.out.println(suv.getTipoGasolina());
        Automovil bici = new Automovil();
        bici.setTipoGasolina("no posee");
        System.out.println(bici.getTipoGasolina());
    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String tipoGasolina;
    String matriculaVehiculo;

    public Vehiculo () {
        System.out.println("estoy en el constructor");
    }

    abstract public void setTipoGasolina (String tipoGasolina);
    abstract public String getTipoGasolina ();

}

class Coche extends Vehiculo {

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public String getTipoGasolina() {
        return "poseo un tipo de combustible: " + this.tipoGasolina;
    }
}
    class Automovil extends Coche {
        public void setTipoGasolina(String tipoGasolina) {
            this.tipoGasolina = tipoGasolina;
        }

        public String getTipoGasolina() {
            return "Otra cosa: " + this.tipoGasolina;
        }

}

interface persona {
    void salir(int horaSalir);
    void entrar(int horaEntrar);
}

class juanito implements persona{
    public void salir (int horaSalir){}
    public void entrar (int horaEntrar){}
}


