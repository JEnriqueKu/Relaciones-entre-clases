package ejercicio3;

import ejercicio3.services.BarajaService;

public class Main {
    public static void main(String[] args) {
        BarajaService bs = new BarajaService();

        bs.crearBaraja();
        System.out.println("Mostrar baraja");
        bs.mostrarBaraja();
        bs.barajar();
        System.out.println("Mostrar baraja barajada");
        bs.mostrarBaraja();
        System.out.println("Mostrar monton");
        bs.mostrarMonton();
        System.out.println("Mostrar siguiente carta");
        System.out.println(bs.siguienteCarta());
        System.out.println("Mostrar cartas para dar");
        System.out.println(bs.darCartas(20));
        System.out.println("Mostrar baraja");
        bs.mostrarBaraja();
        System.out.println("Mostrar monton");
        bs.mostrarMonton();
        System.out.println("Cartas disponibles");
        System.out.println(bs.cartasDisponibles());
    }
}
