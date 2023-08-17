package ejercicioExtra3.servicios;

import ejercicioExtra3.entidades.Cliente;
import ejercicioExtra3.entidades.Poliza;
import ejercicioExtra3.entidades.Vehiculo;

import java.time.LocalDate;

public class PolizaService {
    Poliza poliza = new Poliza();
    ClienteService clienteService = new ClienteService();
    VehiculoService vehiculoService = new VehiculoService();
    int contador=1;
    public Poliza crearPoliza(){
        return new Poliza(contador++, LocalDate.of(2023,01,01),
                LocalDate.of(2023,12,31),12,"Efectivo",
                10000,true,200,"Completa",
                vehiculoService.crearVehiculo(), clienteService.crearCliente());
    }
}
