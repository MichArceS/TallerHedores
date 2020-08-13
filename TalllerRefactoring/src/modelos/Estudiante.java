package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    private Paralelo[] paralelos=null;
    public Estudiante(String codigo, String nombre, String apellido, int edad) {
        super(codigo, nombre, apellido, edad);
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Paralelo p, ArrayList<Double> notas){
        return CalcularNota(p, notas);
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Paralelo p, ArrayList<Double> notas){
        return CalcularNota(p, notas);
    }

    public double CalcularNota(Paralelo p, ArrayList<Double> notas){
        double nota= 0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(notas[0]+notas[1]+notas[2])*0.80;
                double notaPractico=(notas[3])*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:getParalelos()){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
    }

    //Métodos Get and Set de paralelos
}