package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolverDeAgua;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolverDeAgua) {
        this.jugadores = jugadores;
        this.revolverDeAgua = revolverDeAgua;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolverDeAgua() {
        return revolverDeAgua;
    }

    public void setRevolverDeAgua(RevolverDeAgua revolverDeAgua) {
        this.revolverDeAgua = revolverDeAgua;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "jugadores=" + jugadores +
                ", revolverDeAgua=" + revolverDeAgua +
                '}';
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
        setJugadores(jugadores);
        setRevolverDeAgua(r);
    }

    public ArrayList<Jugador> crearJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("Ingrese cuantos jugaran?(1-6)");
        int numJugadores = leer.nextInt();
        if (numJugadores > 6 || numJugadores <=0){
            numJugadores=6;
            System.out.println("Numero de jugadores invalido, los jugadores seran 6");
        }

        for (int i = 0; i < numJugadores ; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre: ");
            jugador.setNombre(leer.next());
            jugador.setID(jugadores.size()+ 1);
            jugadores.add(jugador);
        }

        return jugadores;
    }

    public void ronda(){
        int contador = 0;
        Boolean disparo;
        do {
            Jugador jugadorActual = getJugadores().get(contador);
            if (contador == jugadores.size()-1){
                contador = 0;
            } else {
                contador++;
            }
            disparo = jugadorActual.disparo(revolverDeAgua);
            if(disparo){
                System.out.println("El jugador " + jugadorActual.getNombre() + " se mojo");
            } else {
                System.out.println(jugadorActual.getNombre() + " No se mojo");
            }
            } while (!disparo);

        System.out.println("\nTermino el juego");
    }
}
