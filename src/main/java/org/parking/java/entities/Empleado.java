package org.parking.java.entities;

public class Empleado {
    public String nombres;
    public String apellidos;
    public long codigo;

    //constructor por defecto
    public Empleado() {
    }



    //constructor parametrizado
    public Empleado(String nombres, String apellidos, long codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

}
