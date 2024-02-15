import java.util.ArrayList;
import java.util.List;


public class Materia {
    private String nombreM;
    private double codigo;
    private int capacidadMaxEst;
    private boolean estadoApertura;
    public double indicHabilitacion;
    private List<Estudiante> newEstudiante = new ArrayList<>();
    public Materia(String nombreM, double codigo, int capacidadMaxEst, boolean estadoApertura, List<Estudiante> newEstudiante, double indicHabilitacion) {
        this.nombreM = nombreM;
        this.codigo = codigo;
        this.capacidadMaxEst = capacidadMaxEst;
        this.estadoApertura = estadoApertura;
        this.newEstudiante = newEstudiante;
        this.indicHabilitacion = indicHabilitacion;

    }    
    public String getNombreM() {
        return nombreM;
    }
    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }
    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    public int getCapacidadMaxEst() {
        return capacidadMaxEst;
    }    
    
    public void setCapacidadMaxEst(int capacidadMaxEst) {
        this.capacidadMaxEst = capacidadMaxEst;
    }
    public boolean isEstadoApertura() {
        return estadoApertura;
    }
    public void setEstadoApertura(boolean estadoApertura) {
        this.estadoApertura = estadoApertura;
    }
    public double getIndicHabilitacion() {
        return indicHabilitacion;
    }
    public void setIndicHabilitacion(double indicHabilitacion) {
        this.indicHabilitacion = indicHabilitacion;
    }
    public List<Estudiante> getNewEstudiante() {
        return newEstudiante;
    }
    public void setNewEstudiante(List<Estudiante> newEstudiante) {
        this.newEstudiante = newEstudiante;
    }
    //Metodo estado de apertura
    public void estadoAperturaActual() {
        if (estadoApertura == true) {
        System.out.println("El estado de apertura esta abierto");
        }else { 
            System.out.println("El estado de apertura se encuentra cerrado");
        }
    }
     //Administrador
    public void agregarEstudiante (Estudiante nuevEstudiante) {
        if ( newEstudiante.size() < getCapacidadMaxEst()) {
            newEstudiante.add(nuevEstudiante);
            System.out.println( "El estudiante se agrego");
        }
        else {
            System.out.println( "El estudiante no se pudo agregar porque ya se excedio el limite de estudiantes");
        }
    }

}
    //Notas
