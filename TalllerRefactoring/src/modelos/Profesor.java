package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    protected int a�osdeTrabajo;
    protected String facultad;
    protected double bonoFijo;

    public Profesor(String codigo, String nombre, String apellido,int edad) {
        super(codigo,nombre,apellido,edad);
    }
    
    public void anadirParalelos(Paralelo p){
        boolean add = paralelos.add(p);
    }

    public double calcularSueldo(){
        return a�osdeTrabajo*600 + bonoFijo;
    }

    //M�todos Getters and Setters de los campos
}