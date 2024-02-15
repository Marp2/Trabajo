public class Persona {
    private String nombre;
    private String apellidos;
    private int numIdentificacion;
    public Persona( String nombre, String apellidos, int numIdentificacion) { //Constructores
        if ( nombre == null || nombre.isEmpty()) {
            System.out.println( "El nombre no puede estar nulo");
        }
        this. nombre = nombre;

        if(apellidos == null || apellidos.isEmpty()){ //Condicion
            System.out.println("El apellido no puede estar nulo. Ingrese un apellido adecuado");
        }
        this.apellidos = apellidos;   
        this. numIdentificacion = numIdentificacion;

    }
     //Metodos de acceso
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getNumIdentificacion() {
        return numIdentificacion;
    }
    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    
}

    

