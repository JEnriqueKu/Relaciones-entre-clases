package ejercicioExtra3.servicios;

import ejercicioExtra3.entidades.Vehiculo;

public class VehiculoService {
    Vehiculo vehiculo = new Vehiculo();

    public Vehiculo crearVehiculo(){
        return new Vehiculo("Suzuki", "Swift",2023,"1212","1414","Amarillo","Compacto");
    }
}
