public class EjercicioObjetos {

    public static void main(String[] arg) {

        Persona Persona1 = new Persona();
        Persona1.setEdad(39);
        Persona1.setNombre("Marco Saez");
        Persona1.setTelefono(945851320);
        System.out.println("Nombre:" + " " + Persona1.getNombre() + ", " + "Edad:" + " " + Persona1.getEdad() + ", " + "Telefono;" + Persona1.getTelefono());
    }
}
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad (int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getNombre (){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }

