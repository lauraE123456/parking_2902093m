package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //Sistema de gestion de E/S de vehiculos en un parking
        //1. carritos:
        //Objetos(instancias)
        //Tipo de clase 
        //2. nombre del objeto
        //3. asignacion y new
        //4. constructor
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR );

        Vehiculo carrito2 = new Vehiculo("DAS 987", TipoVehiculo.CAMIONETA);


        //crear(instanciar) un cliente
        Cliente cliente1 = new Cliente("Miguel","Ortiz Neira",124421421L);

        Cliente cliente2 = new Cliente("Samuel","Ardila Salvador", 101960553l);

         //invocar el metodo
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("IMP 798", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos del cliente
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("-----------");
        }
}
}