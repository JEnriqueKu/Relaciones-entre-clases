package ejercicioExtra3.servicios;

import ejercicioExtra3.entidades.Cliente;
import ejercicioExtra3.enums.Apellidos;
import ejercicioExtra3.enums.Nombres;

import java.util.Random;

public class ClienteService {
    Cliente cliente = new Cliente();

    public Cliente crearCliente(){
        Random random = new Random();

        int nombreAzar = random.nextInt(Nombres.values().length);
        int apellidoAzar = random.nextInt(Apellidos.values().length);

        return new Cliente(Nombres.values()[nombreAzar].name(),Apellidos.values()[apellidoAzar].name(),"Doc1","123@correo.com","Calle 24","934142321");
    }
}
