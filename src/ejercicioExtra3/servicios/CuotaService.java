package ejercicioExtra3.servicios;

import ejercicioExtra3.entidades.Cliente;
import ejercicioExtra3.entidades.Cuota;
import ejercicioExtra3.entidades.Vehiculo;

import java.time.LocalDate;

public class CuotaService {
    Cuota cuota = new Cuota();
    int contador =1;

    public Cuota crearCuota(Cliente cliente, Vehiculo vehiculo){
        return new Cuota(contador++,50,true, LocalDate.of(2023,02,15),
                "Efectivo",vehiculo,cliente);
    }
}
