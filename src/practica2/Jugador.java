package practica2;

public class Jugador {
    private String nombre, apellido, posicion;
    private Integer numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }
}
