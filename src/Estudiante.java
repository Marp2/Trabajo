public class Estudiante extends Persona {
    private int edad;

    public Estudiante(String nombre, String apellidos, int numIdentificacion, int edad) {
        super(nombre, apellidos, numIdentificacion);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  

    
}

