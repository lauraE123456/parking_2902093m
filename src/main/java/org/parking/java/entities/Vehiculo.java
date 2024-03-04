package org.parking.java.entities;

public class Vehiculo {
    //atributos de clase
    //1. modificador de acceso
    //2. tipo de dato del atributo
    //3. nombre del atributo
    //Los atributos de una clase para cumpler con enc apsulamiento
    //deben ser privados
    private String placa;
    private TipoVehiculo tipoVehiculo;

    //constructor
    //sin parametros: constructor por defecto
    public Vehiculo() {
    }
    //constructor parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    

    
}
