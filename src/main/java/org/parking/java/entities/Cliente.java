package org.parking.java.entities;

import java.util.List;

import java.util.ArrayList;

public class Cliente {
    //atributos de clase
    //1. modificador de acceso
    //2. tipo de dato del atributo
    //3. nombre del atributo
    private String nombre;
    private String apellidos;
    private Long numIdentificacion;
    private List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
   

    public Cliente() {
    }
    public Cliente(String nombre, String apellidos, Long numIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numIdentificacion = numIdentificacion;
    }
    //definir metodo de clase
    //addVehicle:vincular un carrito al cliente
    public void addVehicle(Vehiculo vehiculo){
        //añadir e carrito a la lista
        //this: para acceder a atributos y metodos al interior del objeto
        this.misVehiculos.add(vehiculo);
    }
    //otra sobrecarga
    //addVehicle
    public void addVehicle (String placa, TipoVehiculo tv){
        Vehiculo v= new Vehiculo();
        //utilizando el setter de placa pñara asignar el valor de placa
        //al nuevo vehiculo
        v.setPlaca(placa);
        v.setTipoVehiculo(tv);
        this.misVehiculos.add(v);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Long getNumIdentificacion() {
        return numIdentificacion;
    }
    public void setNumIdentificacion(Long numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }
    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }
    

}
