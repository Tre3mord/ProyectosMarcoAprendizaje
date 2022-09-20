public class EjercicioHErencia {

    public static void main (String[] Arg){
        Cliente cliente= new Cliente();
        cliente.setNombre("Marco Saez");
        cliente.setEdad(39);
        cliente.setTelefono(123456789);
        cliente.setCredito(true);
        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Antonio Soto");
        trabajador.setEdad(25);
        trabajador.setTelefono(98765432);
        trabajador.setSalario(2000);
        System.out.println("Nombre cliente: " + cliente.getNombre() + ", Edad cliente: "+cliente.getEdad() + ", Telefono cliente: " + cliente.getTelefono() + ", Credito habilitado: " + cliente.isCredito());
        System.out.println("Nombre empleado: " + trabajador.getNombre() + ", Edad empleado: "+trabajador.getEdad() + ", Telefono empleado: " + trabajador.getTelefono() + ", Salario empleado: " + trabajador.getSalario());
    }
}
abstract class Persona {
    int edad;
    String nombre;
    int telefono;

    abstract public void setEdad (int edad);
    abstract int getEdad ();

    abstract void setTelefono (int telefono);
    abstract int getTelefono ();

    abstract void setNombre (String nombre);
    abstract String getNombre ();
}

final class Trabajador extends Persona {

    int salario;

    public void setSalario (int salario) {
        this.salario=salario;
    }

    public int getSalario(){
        return this.salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
}
final class Cliente extends Persona {
    boolean credito;

    public void setCredito (boolean credito) {
        this.credito=credito;
    }

    public boolean isCredito(){
        return this.credito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
}