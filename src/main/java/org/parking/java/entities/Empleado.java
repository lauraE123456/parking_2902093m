package org.parking.java.entities;

public class Empleado {
    private String nombres;
    private String apellidos;
    private long codigo;

    //constructor por defecto
    public Empleado() {
    }



    //constructor parametrizado
    public Empleado(String nombres, String apellidos, long codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }



    public String getNombres() {
        return nombres;
    }



    public void setNombres(String nombres) {
        this.nombres = nombres;
    }



    public String getApellidos() {
        return apellidos;
    }



    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public long getCodigo() {
        return codigo;
    }



    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    

}
