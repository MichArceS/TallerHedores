package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> ayudantias;

    public Ayudante(String codigo, String nombre, String apellido, int edad) {
        super(codigo, nombre, apellido, edad);
    }
    

    public ArrayList<Paralelo> getAyudantias() {
        return ayudantias;
    }

    public void setAyudantias(ArrayList<Paralelo> ayudantias) {
        this.ayudantias = ayudantias;
    }
    
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:ayudantias){
            //Muestra la info general de cada paralelo
        }
    }
}
