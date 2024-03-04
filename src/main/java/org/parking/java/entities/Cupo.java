package org.parking.java.entities;

public class Cupo {
    private char nombre;



    //contrcutor por defecto
    public Cupo() {
    }
    
    //constrcutor parametrizado
    public Cupo(char nombre) {
        this.nombre = nombre;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    
    
}
