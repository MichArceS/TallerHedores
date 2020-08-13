/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Persona {
    //Informacion de la persona
    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected String facultad;
    protected int edad;
    protected String direccion;
    protected String telefono;
    protected ArrayList<Paralelo> paralelos;
    
    public Persona(String codigo, String nombre, String apellido, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    //Métodos Getters and Setters
}