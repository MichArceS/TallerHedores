package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    protected int añosdeTrabajo;
    protected String facultad;
    protected double bonoFijo;

    public Profesor(String codigo, String nombre, String apellido,int edad) {
        super(codigo,nombre,apellido,edad);
    }
    
    public void anadirParalelos(Paralelo p){
        boolean add = paralelos.add(p);
    }

    public double calcularSueldo(){
        return añosdeTrabajo*600 + bonoFijo;
    }

    //Métodos Getters and Setters de los campos
}