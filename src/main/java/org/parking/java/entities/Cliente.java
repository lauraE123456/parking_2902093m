package org.parking.java.entities;

import java.util.List;

import java.util.ArrayList;

public class Cliente {
    //atributos de clase
    //1. modificador de acceso
    //2. tipo de dato del atributo
    //3. nombre del atributo
    public String nombre;
    public String apellidos;
    public Long numIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
   

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
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);
    }

}
