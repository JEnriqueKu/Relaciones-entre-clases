package ejercicioExtra3;

import ejercicioExtra3.entidades.Cuota;
import ejercicioExtra3.entidades.Poliza;
import ejercicioExtra3.servicios.CuotaService;
import ejercicioExtra3.servicios.PolizaService;

import java.util.ArrayList;
import java.util.Scanner;


public class Tienda {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    PolizaService polizaService = new PolizaService();
    CuotaService cuotaService = new CuotaService();
    private ArrayList<Poliza> polizas = new ArrayList<>();

    public void registrarPoliza(){
        polizas.add(polizaService.crearPoliza());
    }
    public void registrarCuota(){
        System.out.println("Existen actualmente "+ polizas.size()+ " polizas, ¿A cual número de póliza desea agregar una cuota?");
        int numeroDePoliza= scanner.nextInt();
        for (Poliza poliza : polizas) {
            if (poliza.getNumeroPoliza()==numeroDePoliza){
                poliza.getCuotas().add(cuotaService.crearCuota(poliza.getCliente(),poliza.getVehiculo()));
                }
            }
    }
    public void mostrarPolizas(){
        if (polizas.isEmpty()) System.out.println("No existen pólizas");
        else {
            for (Poliza poliza : polizas) {
                System.out.println(poliza);
            }
        }
    }
    public void mostrarCuotas(){
        if (polizas.isEmpty()) System.out.println("No existen pólizas");
        else {
            System.out.println("Existen actualmente "+ polizas.size()+ " polizas, ¿De cual número de póliza desea ver las cuotas?");
            int numeroDePoliza= scanner.nextInt();
            for (Poliza poliza : polizas) {
                if (poliza.getNumeroPoliza()==numeroDePoliza && !poliza.getCuotas().isEmpty()){
                    for (Cuota cuota : poliza.getCuotas()) {
                        System.out.println(cuota);
                    }
                } else if (poliza.getNumeroPoliza()==numeroDePoliza && poliza.getCuotas().isEmpty()) {
                    System.out.println("La poliza no tiene cuotas");
                }
            }
        }
    }

    public void menu(){
            int opc=0;

            do{
                System.out.println("Ingrese una opción: ");
                System.out.println("1.- Registrar poliza");
                System.out.println("2.- Registrar cuota");
                System.out.println("3.- Mostrar polizas");
                System.out.println("4.- Mostrar Cuotas");
                System.out.println("5.- Salir");

                opc = scanner.nextInt();
                switch (opc){
                    case 1:
                        registrarPoliza();
                        break;
                    case 2:
                        registrarCuota();
                        break;
                    case 3:
                        mostrarPolizas();
                        break;
                    case 4:
                        mostrarCuotas();
                        break;
                    case 5:
                        break;
                }
            }while(opc != 5);
        }


}
