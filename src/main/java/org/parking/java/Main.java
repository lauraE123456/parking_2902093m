package org.parking.java;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
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
        
        //instanciar cupo
        Cupo cupito1= new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //intancia de empleado
        Empleado empleado1 = new Empleado("Steven", "Rodriguez", 1);

        //CREAR FECHAS
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024,Month.FEBRUARY, 1, 15, 30, 0);

        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 0);

        //Hacer registros(pagos) E/S de vehiculos
        Pago pago1 = new Pago(fechaHoraInicio,fechaHoraFin,5000.0,cliente1.misVehiculos.get(0),cupito1,empleado1);

        Pago pago2 = new Pago(fechaHoraInicio, fechaHoraFin, 7000.0, cliente1.misVehiculos.get(1), cupito2,empleado1);

        //Añadir pagos a una lista de pagos
        List<Pago>misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);

        //recorrer los pagos para mostrar informacion
        for( Pago p :misPagos){
            //evidencia:
            //mostrar:
            //placa del vehiculo - valor pagado - fecha y hora de inicio - fecha y hora fin - cupo(nombre)
            System.out.println( "Pago |Placa: " + p.vehiculo.placa + "|" );
            System.out.println( "|valor:" + p.valor + "|");
            System.out.println("|fecha y hora de entrada:" + p.fechaHoraInicio.toString() + "|");
            System.out.println("|Fecha y hora de fin: "  + p.fechaHoraFin.toString() + "|");
            System.out.println("|Cupo:" + p.cupo.nombre + "|");
            System.out.println("|Empleado: " + p.empleado.codigo + "|");
        }
        
}
}