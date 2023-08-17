package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        RevolverDeAgua r = new RevolverDeAgua();

        r.llenarRevolver(r);
        juego.llenarJuego(juego.crearJugadores(), juego.getRevolverDeAgua());
        juego.ronda();
    }
}