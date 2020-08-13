package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public InformacionAdicionalProfesor info;

    public Profesor(String codigo, String nombre, String apellido,int edad) {
        super(codigo,nombre,apellido,edad);
    }
    
    public void anadirParalelos(Paralelo p){
        boolean add = paralelos.add(p);
    }
    
}
